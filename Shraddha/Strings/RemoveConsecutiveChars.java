package Shraddha.Strings;

public class RemoveConsecutiveChars {
    public String removeConsecutiveCharacter(String s){
        StringBuilder ans = new StringBuilder("");
        ans.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                continue;
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
