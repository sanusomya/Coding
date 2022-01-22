package Binary_Search;
import java.util.*;
public class find_just_smallest_than_target {
    //not for repeating numbers in array
    //floor means maximum number such that target >= number
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int res = -1;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                res = arr[mid];
                break;
            }
            else if(arr[mid] < target){
                res = arr[mid];
                start = mid+1;
            }
            else end = mid-1;
        }
        System.out.println(res);
    }
}
