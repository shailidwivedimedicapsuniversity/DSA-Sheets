package Arrays;

public class Ques8 {
    static long maxSubarraySum(int arr[], int n) {

        // Your code here
        // 1.Approach 
        // tc= O(n^3)
        // long maxSum = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        // for(int j=i; j<n; j++){
        // long sum = 0;
        // for(int k=i; k<=j; k++){
        // sum+=arr[k];
        // }
        // if(sum>maxSum){
        // maxSum = sum;
        // }
        // }
        // }
        // return maxSum;

        // 2.Approach tc= O(n^2)
        // long maxSum = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        //     long sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum > maxSum) {
        //             maxSum = sum;
        //         }
        //     }
        // }
        // return maxSum;

        // 3.Approach : Max subarray using prefix sum appraoch
        // tc= O(n^2+n) SC=O(n)
        long maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        // calculte prefix sum array
        for(int i=1; i<n; i++){
            prefix[i] = arr[i]+ prefix[i-1];
        }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                //prefix[end] - prefix[start-1]
                long currSum=(i==0)?prefix[j] : prefix[j]-prefix[i-1];
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    long kadanesAlgo(int arr[], int n){
        
        // Your code here
        // Max subarray using KADANE'S ALGOrigthm appraoch
        // tc= O(n) SC= O(1)
        long maxSum = Integer.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxSum;
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println(maxSubarraySum(arr, 5));
    }

}
