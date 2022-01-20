package Sliding_Window.fixed_length;

import java.util.*;
public class max_of_all_subarrays_of_size_k {
    public static void main(String[] args) {
        int k = 4, n = 10;
        int[] arr = {8,5,10,7,9,4,15,12,90,13};
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> li = new ArrayList<>();
        int i = 0, j = 0;
        while(j<n){
            q.add(arr[j]);
            if(j-i+1 == k){
                li.add(q.peek());
                q.remove(arr[i]);
                i++;
            }
            j++;
        }
        System.out.println(li);
    }
}
