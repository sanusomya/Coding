package Binary_Search;
import java.util.*;
public class first_and_last_occurrence {
    public static void main(String[] args) {
        int[] arr = {2,6,7,7,8,10,10,10,20,21,22,22,22};
        int target = 10;
        int start = 0, end = arr.length-1;
        int first = 0, last = 0;

        // first occurrence
        while(start <= end){
            int mid = start+(end-start)/2;
            if((mid == 0 && arr[mid] == target) || (arr[mid] == target && arr[mid-1] < target)){
                first = mid;
                break;
            }
            else if((arr[mid] == target && arr[mid-1] == target) || (arr[mid] > target)) end = mid-1;
            else start = mid+1;
        }

        start = 0;
        end = arr.length-1;

        //last occurrence
        while(start <= end){
            int mid = start+(end-start)/2;
            if((mid == arr.length-1 && arr[mid] == target) || (arr[mid] == target && arr[mid+1] > target)){
                last = mid;
                break;
            }
            else if((arr[mid] == target && arr[mid+1] == target) || (arr[mid] < target)) start = mid+1;
            else end = mid-1;
        }

        System.out.println(first+" "+last);
    }
}
