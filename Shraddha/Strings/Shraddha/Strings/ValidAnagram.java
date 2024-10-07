package Shraddha.Strings;

import java.util.Arrays;

public class ValidAnagram {

    // Approach 1: Sorting
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }

}
