package Shraddha.Strings;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        // brute force TC = N, SC = N
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        StringBuilder ans = new StringBuilder("");
        for(int i=s.length()-1; i>=0; i--){
            ans.append(s.charAt(i));
        }
        String result = ans.toString();
        if(s.equals(result)){
            return true;
        }else{
        //  System.out.println(s);
        //  System.out.println(result);
            return false;
        } 
    }

    public static boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        s = s.toLowerCase();

        int si = 0; 
        int ei = s.length()-1;
        while(si<=ei){
            char start = s.charAt(si);
            char end = s.charAt(ei);
            if(!Character.isLetterOrDigit(start)){
                si++;
            }   else if(!Character.isLetterOrDigit(end)){
                ei--;
            }   else{
                if(start!=end){
                    return false;
                }
                si++;
                ei --;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String s) {
        s = s.toLowerCase();
      
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
        	char first = s.charAt(start);
        	char last = s.charAt(end);
        	if (!Character.isLetterOrDigit(first)) {
        		start++;
        	} else if(!Character.isLetterOrDigit(last)) {
        		end--;
        	} else {
                if(first != last){
        			return false;
        		}
        		start++;
        		end--;
        	}
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome3("  : : :,101"));;
    }
    
}
