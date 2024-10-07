package Shraddha.Strings;
import java.util.*;
public class ValidParentheses {
    // this is a stack question
    
}
class Solution {
    public boolean isValidParantheses(String s) {
        // tc = n
     Stack<Character> st = new Stack<>();
     for(int i=0; i<s.length(); i++){
         char ch = s.charAt(i);
         if(ch=='(' || ch=='{' || ch=='['){
             // for opening 
             st.push(ch);
         }else{
             // for closing 
             if(st.isEmpty()){
                 return false;
             } 
             if(st.peek()=='('&& ch==')' || st.peek()=='{'&& ch=='}'
              || st.peek()=='['&& ch==']'){
                  st.pop();
              }else{
                  return false;
              }
         }
    }
    if(st.isEmpty()){
         return true;
    }
    return false;
 }
}
