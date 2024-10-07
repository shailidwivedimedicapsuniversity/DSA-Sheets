import java.util.*;
public class PrintDuplicates {
    //Print all the duplicate characters in a string 
    public static void printallduplicates1(String str){
        //using sorting 
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            int count = 1;
            while(i<arr.length-1 && arr[i]==arr[i+1] ){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(arr[i]+" count "+ count);
            } 
        }   
    }

    public static void printallduplicates2(String str){
        // using hashing 
        Map<Character, Integer>map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> it: map.entrySet()){
            if(it.getValue()>1){
                System.out.println(it.getKey()+" count "+ it.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "greeksforgreeks";
        printallduplicates1(str);
        System.out.println();
        printallduplicates2(str);
    }
}
