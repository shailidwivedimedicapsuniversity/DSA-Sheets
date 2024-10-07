package Shraddha.Arrays;

public class Ques6 {
    //  Search in Rotated Sorted Array
    // Searching & Sorting , ques 3
    // Apna college dsa 
    public static int search1(int[] nums, int target) {
        // 1. using lenear search , tc = o(n)
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        // 1. using binary search, tc = O(logn)
        int start = 0  , end = nums.length-1;
        int mid ;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            // identify sorted half, it could be either left or right
            if(nums[start]<=nums[mid]){
                // left part is sorted
                if(nums[start]<=target && nums[mid]>=target){
                    end = mid-1; // change ei
                }else{
                    start = mid+1; // change si
                }
            } else{
                //right part is sorted
                if(nums[mid]<=target && nums[end]>=target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }

    
}
