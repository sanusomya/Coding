package Binary_Search;

import java.util.*;
// https://leetcode.com/problems/find-peak-element/  refer to this question

// the concept used here is binary search on answer concept where we
// apply binary search even if the array is unsorted.
public class Peak_element {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,4,1,7};
        int ans = 0;
        if(nums.length == 1) ans = 0;
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid == 0 && nums[mid+1] < nums[mid]) {
                ans =  mid;
                break;
            }
            else if(mid == nums.length-1 && nums[mid-1] < nums[mid]){
                ans = mid;
                break;
            }
            else if((mid > 0 && mid < nums.length-1) &&nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                ans = mid;
                break;
            }
            else if(mid == 0 && nums[mid] < nums[mid+1]) start = mid+1;
            else if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]) start = mid+1;
            else end = mid-1;
        }
        System.out.println(ans);
    }
}
