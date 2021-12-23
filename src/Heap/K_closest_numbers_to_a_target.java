package Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class K_closest_numbers_to_a_target {
    public static void main(String[] args) {
        int[] arr = {3,4,7,8,9,1,0,2,11};
        int k = 3, target = 5;
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new comp());
        for(int i = 0; i<arr.length; i++){
            queue.add(new Pair(Math.abs(arr[i]-target),i));
            if(queue.size() > k) queue.poll();
        }
        while(queue.size() > 0){
            System.out.println(arr[queue.poll().value]);
        }
    }
}
class comp implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        return o2.key- o1.key;
    }
}
class Pair{
    int key , value;
    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
