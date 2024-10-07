package Shraddha.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Ques5 {
    // Chocolate Distribution Problem tc =O(nlogn)
 public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        // sort the al using collections 
        Collections.sort(a);

        long minDiff = Long.MAX_VALUE;
        for(int i=0; i<n-m+1; i++){
           int diff = a.get(i+m-1)-a.get(i);
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }
}
 