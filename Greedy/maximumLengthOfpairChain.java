import java.util.*;
class Solution {
    public static int findLongestChain(int[][] pairs) {
        
        // Using comparator to sort the 2D array
        Arrays.sort(pairs, (a,b)-> Integer.compare(a[1], b[1]));

        int curr = Integer.MIN_VALUE;
        int max = 0;

        // using loop we are checking one array at a time and updating curr
        for(int[] pair : pairs){
            // In case this if condition satisfied, then increment max otherwise move to next array
            if(curr < pair[0]){
                curr = pair[1];
                max++;
            }
        }

        // At last returning the max count
        return max;      

    }
public static void main(String[] gg)
{
int[][] pair = new int[][]{{1,2},{2,3},{3,4}};
System.out.println(findLongestChain(pair));
}
}