import java.util.*;

public class Anagrams {
    
    
    public static boolean areAnagrams(String str1, String str2) {
        
        if (str1.length() != str2.length()){
            return false;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if (areAnagrams(str1, str2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        
    
    }
}