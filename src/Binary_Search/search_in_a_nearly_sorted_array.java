package Binary_Search;

import java.util.*;
public class search_in_a_nearly_sorted_array {
    //nearly sorted means the element that should be present at i
    //can be present at i-1 or i+1
    public static void main(String[] args) {
        int[] arr = {3, 2, 10, 4, 40};
        int target = 40;
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            if(mid-1 > start && arr[mid-1] == target){
                ans = mid-1;
                break;
            }
            if(mid+1 < end && arr[mid+1] == target && arr[mid] > target){
                ans = mid-1;
                break;
            }
            if(arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        System.out.println(ans);
    }

}
