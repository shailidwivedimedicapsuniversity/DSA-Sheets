package Arrays;
import java.util.Arrays;
class Question3 {

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    {  // l and r are starting and ending idx
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
        // if largest then , return arr[arr.length-k];
    } 
    public static int kthLargest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        return arr[arr.length-k];
    } 
    public static void main(String[] args) {
        int a[] = {3,6,9,12,2,4};
        System.out.println(kthSmallest(a, 0, 5, 3));
                System.out.println(kthLargest(a, 0, 5, 3));

    }
     
}
