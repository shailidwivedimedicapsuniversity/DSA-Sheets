package Shraddha.Strings;

import java.util.ArrayList;

public class RemoveDuplicates {
    // Remove all duplicates from a given string

    String removeDuplicates(String str) {
        // code here TC =N^2  , SC =N
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            int count = 1; 
            for(int j=0; j<i; j++){
                if(str.charAt(i)==str.charAt(j)){
                        count++;
                }
            }
                
            if(count==1){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    String removeDuplicates2(String str) {
        String s="";
        for(int i=0;i<str.length();i++)
        {
            if(!(s.contains(str.charAt(i)+"")))
            {
                s+=str.charAt(i);
            }
        }
        return s;
    }
     String removeDuplicates3(String str) {
        // code here
        ArrayList<Character> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
           
            if(!al.contains(ch)){
                al.add(ch);
                sb.append(str.charAt(i));
            }
        }
    
        return sb.toString();
    }


}
