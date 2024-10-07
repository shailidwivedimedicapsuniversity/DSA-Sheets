// find duplicate in an array of N+1 Integers
package Arrays;
import java.util.*;
public class Ques11 {
    //There is only one repeated number in nums, return this repeated number. 
        public static int findDuplicate(int[] nums) {
            //1. TC = O(n^2) brute force, Time Limit Exceeded
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        return nums[i];
                    }
                }
            }
            return -1;
        }
        // Is Contains Duplicate
        public static boolean containsDuplicate(int[] nums) {
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }

        //2. better than brute force , TC = O(nlogn)
        public boolean containsDuplicate2(int[] nums) {
            //TC = nlogn + n 
            Arrays.sort(nums);
            for(int i=0; i<nums.length-1; i++){
                    if(nums[i]==nums[i+1]){
                        return true;
                    }
                
            }
            return false;
        }

        public int findDuplicate2(int[] nums) {
            Arrays.sort(nums);
            for(int i=0; i<nums.length; i++){
                    if(nums[i]==nums[i+1]){
                        return nums[i];
                    }
                
            }
            return -1;
        }
        // 3. we can also solve this using hashmap or linked list

        public static void main(String[] args) {
            int arr[] = {1,4,8,3,4};
            System.out.println(findDuplicate(arr));
            System.out.println(containsDuplicate(arr));
        }
    
}