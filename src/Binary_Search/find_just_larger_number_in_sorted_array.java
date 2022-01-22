package Binary_Search;

import java.util.*;
public class find_just_larger_number_in_sorted_array {
    //not for repeating numbers in array
    //ceil means minimum number such that target <= number
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int target = 6;
        int res = -1;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                res = arr[mid];
                break;
            }
            else if(arr[mid] > target){
                res = arr[mid];
                end = mid-1;
            }
            else start = mid+1;
        }
        System.out.println(res+" "+arr[start]);
    }
}
