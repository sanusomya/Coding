package Sliding_Window.variable_length;
import java.util.*;
//all numbers included
public class Longest_subarray_with_k_sum {
    public static void main(String[] args) {
        int[] A = {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
        int N = A.length;
        int k = 5;
        int max = 0, j = 0, sum = 0;

        // the principle used here is prefix sum
        // if map has sum-k that means total length - length of sum-k
        // subarray will give the length of sum subarray
        Map<Integer,Integer> map = new HashMap<>();

        //here we are putting prefix sum 0 to index -1 to handle corner cases
        map.put(0,-1);
        while(j<N){
            sum += A[j];
            if(map.containsKey(sum-k)){
                max = Math.max(max,j-map.get(sum-k));
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum));
            }
            else{
                map.put(sum,j);
            }
            j++;
        }
        System.out.println(max);
    }
}
