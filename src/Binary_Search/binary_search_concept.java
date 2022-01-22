package Binary_Search;

//watch binary search on answer and infinite array concept from Aditya Verma
import java.util.*;
public class binary_search_concept {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int target = 4;
        int start = 0, end = n-1;
        int[] p = {9,8,7,6,5,1};
        int x = 1;
        //iterative approach
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            } else if (arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        //if key is not present in the array then
        //end will point at the floor and start at ceil
        System.out.println(rightbinarySearch(p,x,0,p.length-1)+" "+binarysearch(p,x,0,p.length-1));
    }
    //recursive approach
    static int binarysearch(int[] arr, int target,int start,int end){
        if(start > end) return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return mid;
             else if (arr[mid] > target) return binarysearch(arr,target,start,mid-1);
        else return binarysearch(arr,target,mid+1,end);
    }
    // for descending array
    static public int rightbinarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = (end+start)/2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] < target) return rightbinarySearch(arr,target,start,mid-1);
        else return rightbinarySearch(arr,target,mid+1,end);
    }
}

