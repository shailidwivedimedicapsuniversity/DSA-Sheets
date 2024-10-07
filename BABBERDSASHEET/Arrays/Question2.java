package Arrays;

public class Question2 {
    public static int findSum(int arr[],int n) 
    {
        //code here
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(findSum(arr, 5));
    }
}
