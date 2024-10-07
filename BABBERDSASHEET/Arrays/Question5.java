package Arrays;

import java.util.Arrays;

public class Question5 {
    // Move All Negative Numbers To Beginning And Positive To End ,with constant space , order is not imp
    public static int[] separateNegativeAndPositive(int arr[]) {
        // all negative numbers to one side of an array
        // 1. we can also use sorting techniques but it will use nlogn TC
        int idx =  -1;
        int temp;
        for(int i=0;  i<arr.length; i++){
            if(arr[i]<0){
                idx++;
                // swap arr[i] and arr[j]
                temp = arr[i];
                arr[i]= arr[idx];
                arr[idx]= temp;
            }
        }
        return arr;
    }

    // Approach 2: Sort the array:
    public static void sortArray(int arr[]){
        Arrays.sort(arr);
    }


    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        //   Move All Negative Numbers To end ,with constant space , order is not imp
        // TC = n, sc = 1
        int j =  n;
        int temp;
        for(int i=n-1;  i>=0; i--){
            if(arr[i]<0){
                j--;
                // swap arr[i] and arr[j]
                temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        
   }

   public void MoveNegativeToEnd(int arr[], int n)
   {
    // Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
       // Your code goes here
       // TC = O(n)+O(n)+O(n) = O(3n)
       // SC = O(n)
       int ans[]= new int[n];
       int idx = 0;
       for(int i=0; i<n; i++){
           if(arr[i]>=0){
               ans[idx]=arr[i];
               idx++;
           }
       }
       for(int i=0;i<n ; i++){
           if(arr[i]<0){
               ans[idx]=arr[i];
               idx++;
           }
       }
       for(int i=0; i<n; i++){
           arr[i]=ans[i];
       }
  }

   public static void main(String[] args) {
    
   }
    
}
