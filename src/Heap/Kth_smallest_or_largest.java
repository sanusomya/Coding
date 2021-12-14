package Heap;

// find kth largest or smallest number
import java.util.*;

public class Kth_smallest_or_largest {
    public static void main(String[] args) {
        // sorted order : 5,6,7,10,12,15,20
        int[] arr = {10,12,5,6,15,7,20};
        int k = 3;
        //min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k) minHeap.poll();
        }
        //max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k) maxHeap.poll();
        }
        System.out.println("3rd largest number is : "+minHeap.peek());
        System.out.println("3rd smallest number is: "+maxHeap.peek());
    }
}
