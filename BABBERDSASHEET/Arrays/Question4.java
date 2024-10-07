package Arrays;

import java.util.ArrayList;

public class Question4 {

    public static void sort012(int arr[], int n)
    {
        // code here 
        // use sorting techniques TC = O(nlogn) 
        // but this is better approach TC = O(2n)
        // Arrays.sort(a);
        int c0 =0;
        int c1 =0;
        int c2 =0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                c0++;
            }
            if(arr[i]==1){
                c1++;
            }else if(arr[i]==2){
                c2++;
            }
        }
        for(int i=0; i<c0; i++){
            arr[i] = 0;
        }
        for(int i=c0; i<c0+c1; i++){
            arr[i] = 1;
        }
        for(int i=c0+c1; i<n; i++){
            arr[i] = 2;
        }     
    }

    public static void sortArray012(ArrayList<Integer> arr, int n) {
        // Write your code here.
       // dutch nation flag algorithm
        int low = 0, mid = 0, high = n - 1; // 3 pointers
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,0,2,1};
        sort012(a, 5);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(2);
        sortArray012(list, 5);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}