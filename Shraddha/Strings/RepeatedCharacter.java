package Shraddha.Strings;
import java.util.Arrays;
public class RepeatedCharacter {
    char firstRepeatedChar(String s)
    {
        // your code here
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                return ch[i];
                }
            }
        }
        return '#';
    }
    // Print all the duplicate characters in a string
    public static void printDuplicates(String str){
        //1. sort the string characters : str = "shaili "
        char[] ch = str.toCharArray(); 
        // ch = [s,h,a,i,l,i]
        Arrays.sort(ch);
        // ch = [a,h,i,i,l,s]
        String ans = new String(ch);
        // ans = ahiils

        //2. Traverse Loop the sorted string to find the duplicates.
        for(int i=0; i<str.length(); i++){
            int count = 1;
            //find duplicates here 
            while( i<str.length()-1 && ans.charAt(i)==ans.charAt(i+1)){
                count++;
                i++;
            }
        // If the count is greater than one then we print the character and its count.
            if(count>1){
                System.out.println(ans.charAt(i)+" "+count);
            }
        }

    }

    public static void main(String[] args) {
        String s = "shaili";
        printDuplicates(s);
    }

}
