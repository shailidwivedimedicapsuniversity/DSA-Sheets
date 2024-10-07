package Arrays;
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,5,7,9};
        System.out.println(doUnion(arr1, 5, arr2, 4));
        System.out.println(intersectionOfArrays(arr1, arr2, 5, 5));
    }
        // Find the Union and Intersection of the two sorted arrays.
        //1. Union of two arrays and return size of union array

        public static int doUnion(int arr1[], int n, int arr2[], int m) 
        {
            //Your code here  
            // Approach 1 
            int i=0, j=0;
            ArrayList<Integer>union = new ArrayList<>();      
             while (i < n && j < m) {
                // arrays are sorted
                if (arr1[i] < arr2[j]){
                    union.add(arr1[i]);
                    i++;
                }
                else if (arr2[j] < arr1[i]){
                    union.add(arr2[j]);
                    j++;
                }
                else {
                    union.add(arr1[i]);
                    i++;
                    j++;
                }
            }
     
            /* Print remaining elements of 
             the larger array */
            while (i < n)
                union.add(arr1[i++]);
            while (j < m)
                union.add(arr2[j++]);
                
            return union.size();

            // Approach 2
            // ArrayList<Integer> list = new ArrayList<>();
        
            // for(int i=0;i<n;i++){
            //     if(!list.contains(arr1[i])){
            //         list.add(arr1[i]);
            //     }
            // }
            
            // for(int i=0;i<m;i++){
            //     if(!list.contains(arr2[i])){
            //         list.add(arr2[i]);
            //     }
            // }
            
            // return list.size();       


        //Your code here
        // Approach 3
        // optimise solution using set
        //  HashSet<Integer> union = new HashSet<>();
        //  for(int i=0; i<n; i++ ){
        //      union.add(arr1[i]);
        //  }
        //  for(int i=0; i<m; i++){
        //      union.add(arr2[i]);
        //  }
        //  return union.size();      
    }   
    
    // Intersection of two unsorted/sorted arrays
    public static int intersectionOfArrays(int a[],int b[], int n, int m ){
        // brute force approach TC=O(N^2)
        // ArrayList<Integer>list = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(a[i]==b[j]){
        //             list.add(a[i]);
        //         }
        //     }
        // }
        // return list.size();

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        int count =0;
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                count++;
                set.remove(b[i]);
            }
        }
        return count;

    }


    public int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<num1.length; i++){
            set.add(num1[i]);
        } 
        for(int i=0; i<num2.length; i++){
            if(set.contains(num2[i])){
                list.add(num2[i]);
                set.remove(num2[i]);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
     }

    
}
