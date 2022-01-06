package Sliding_Window.fixed_length;

import java.util.*;

public class first_negative_number_in_a_window {
    public static void main(String[] args) {
        int N = 8,K = 3;
        int[] A = {12,-1,3,-4,-5,3,-3,2};
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        while(j<N){
            if(A[j] < 0) li.add(A[j]);
            if(j-i+1 == K){
                if(li.size() > 0){
                    arr.add(li.get(0));
                    if(li.get(0) == A[i]) li.remove(0);
                }
                else arr.add(0);
                i++;
            }
            j++;
        }
        System.out.println(arr);
    }
}
