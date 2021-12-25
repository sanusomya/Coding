package Heap;

import java.util.*;

public class Top_k_frequent_numbers {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,2,4,3,5,6,5,5,7,8,4};
        int k = 3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        System.out.println(map);
        Comparator<Pair> comp = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.value == o2.value) return o2.key- o1.key;
                return o1.value- o2.value;
            }
        };
        PriorityQueue<Pair> queue = new PriorityQueue<>(comp);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            queue.add(new Pair(e.getKey(), e.getValue()));
            if(queue.size() > k) queue.poll();
        }
        while (queue.size() > 0) System.out.println(queue.poll().key);
    }
}

