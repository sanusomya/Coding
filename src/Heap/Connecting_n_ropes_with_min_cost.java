package Heap;

import java.util.*;
public class Connecting_n_ropes_with_min_cost {
    public static void main(String[] args) {
        long[] arr = {4,3,6,2};
        int n = arr.length;
        PriorityQueue<Long> q = new PriorityQueue<>();
        for(int i = 0; i<arr.length; i++) q.add(arr[i]);
        long sum = 0;
        while(q.size() > 2){
            long temp = q.poll();
            temp += q.poll();
            sum += temp;
            q.add(temp);
        }
        long temp = q.poll();
        if(q.size() > 0) temp += q.poll();
        sum += temp;
        System.out.println(sum);
    }
}
