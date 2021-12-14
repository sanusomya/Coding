package Heap;

import java.util.*;

public class K_sorted_array {
    public static void main(String[] args) {
        //k sorted array is an array in which the elements are k
        // displaced from there position when compared to a sorted array

        //you have to get a sorted array
        int[] arr = {6,5,3,2,8,10,9};

        //sorted order : 2 3 5 6 8 9 10
        int k = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k) arr[j++] = minHeap.poll();
        }
        while(!minHeap.isEmpty()) arr[j++] = minHeap.poll();
        for(int i = 0; i< arr.length; i++) System.out.print(arr[i]+" ");
    }
}
