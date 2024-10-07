package Shraddha.Strings;
import java.util.HashMap;
public class LongestSubString{
    public static int longestSubstring(String s){
        // sliding window  TC = O(n)
        int maxLength = 0;
        int i=0;
        int j=0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while(j<n){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
            // sare chars uniqe hai 
            // j-i+1 = current Substring Length
            if(map.size() == j-i+1){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }

            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);

                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        // String s = "abcabcbaa";
        String s = "Iamshaili";
        System.out.println(longestSubstring(s));
    }
}