package BasicQuestion;

public class OddEven {
    public static void main(String[] args) {
    int arr[] = {2,5,3,8,1,9,4};
    int j = -1 ; 
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0){
            // even num first
            j++;
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }    
}
