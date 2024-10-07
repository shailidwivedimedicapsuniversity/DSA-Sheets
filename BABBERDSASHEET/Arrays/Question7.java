package Arrays;

public class Question7 {
    // Given an array, rotate the array by one position in clock-wise direction.
    // Cyclically rotate an array by one

    public static void rotate(int arr[], int n)
    {
        // using extra array
        int ans[] = new int[n];
        ans[0] = arr[n-1];
        // TC = O(n+m) SC= O(n)
        for(int i=1; i<n; i++){
            ans[i]= arr[i-1];
        }
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    }
    public void rotate2(int arr[], int n)
    {
        // without using any space
        int last = arr[n-1];
        for(int i=n-2; i>=0; i--){
            // reverse loop
            arr[i+1]= arr[i];
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        rotate(arr,5);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
