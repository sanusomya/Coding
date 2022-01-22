package Binary_Search;
import java.util.*;
public class Allocate_minimum_number_of_pages {
    //https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/ refer to this question
    public static void main(String[] args) {
        int[] A = {10,20,30,40};
        int M = 2, N = A.length;
        int res = 0;
        int sum = 0, max = 0;
        for(int i = 0; i<N; i++){
            max = Math.max(max,A[i]);
            sum += A[i];
        }
        int start = max, end = sum;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isvalid(A,mid,M)){
                res = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        System.out.println(res);
    }
    static boolean isvalid(int[] A, int mid, int k){
        int st = 1, sum = 0;
        for(int i = 0; i<A.length; i++){
            sum += A[i];
            if(sum > mid){
                st++;
                sum = A[i];
            }
            if(st > k) return false;
        }
        return true;
    }
}
