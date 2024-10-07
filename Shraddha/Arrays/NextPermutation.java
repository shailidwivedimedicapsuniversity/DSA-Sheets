package Shraddha.Arrays;

public class NextPermutation {
        public void nextPermutation(int[] nums) {
            int idx = -1;
            int n = nums.length;
    
            // Step 1: Finding the longest prefix match or a[i] < a[i+1]
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    idx = i; // Break point
                    break;
                }
            }
    
            if (idx == -1) {
                // If no such prefix match is found, reverse the entire array
                reverse(nums, 0, n - 1);
                return;
            }
    
            // Step 2: Find nums[i] > nums[idx] but stay close to idx
            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    // Swap nums[i] and nums[idx]
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
    
            // Step 3: Reverse the subarray to the right of idx
            reverse(nums, idx + 1, n - 1);
        }
    
        // Helper function to reverse a subarray
        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                // Swap elements at start and end indices
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            
        }    
}
