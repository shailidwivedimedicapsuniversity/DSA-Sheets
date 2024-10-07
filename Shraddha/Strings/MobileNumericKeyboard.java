package Shraddha.Strings;

public class MobileNumericKeyboard {
    String printSequence(String s) 
    { 
        // code here
        StringBuilder ans = new StringBuilder("");
        // making array  to store moblile alphabates(uppercase) corresponding to numbers  
        String[] mobileKeypad = {"2","22","222","3","33","333",
        "4","44","444","5","55","555","6","66","666",
        "7","77","777","7777","8","88","888","9","99","999","9999"};
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                ans.append("0");
            }else{
                ans.append(mobileKeypad[s.charAt(i)-'A']);
            }
        }
        return ans.toString();
    }
}
