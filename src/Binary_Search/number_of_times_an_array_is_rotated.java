package Binary_Search;

import java.util.*;
public class number_of_times_an_array_is_rotated {
    public static void main(String[] args) {

        // if array contains repeating elements this method fails

        // the concept is to find the minimum number in the array
        // we develop case
        // 1 : if the segment is sorted i.e. arr[end] > arr[start] then return low
        //2 : now we check if our middle element if less than
        // both its previous and next elements
        //3 : if arr[start] < arr[mid] then left side if sorted we need to go to the right side
        // 4 : similarly we can go to left side if vice versa


        int[] arr = {1};
        int start = 0, end = arr.length-1, n = arr.length;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(arr[start] <= arr[end]){ //for arrays of length 1 equal to sign is used
                ans = start;
                break;
            }
            else if(arr[mid] < arr[prev] && arr[mid] < arr[next]){
                ans = mid;
                break;
            }
            else if(arr[mid] < arr[end]) end = mid-1;
            else start = mid+1;
       }
        System.out.println("Left rotation : "+(n-ans));
        System.out.println("Right rotation : "+(ans));
    }
}
