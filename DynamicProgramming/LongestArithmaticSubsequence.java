import java.util.*;
class Solution {
    public static int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
         map.put(arr[i],map.getOrDefault((arr[i]-difference),0)+1);
        }
         int output = 1;

         for(Integer v: map.values())
         {
        output = Math.max(v,output);
         }

         return output;
    }
public static void main(String[] gg)
{
int [] num = new int[]{11,9,7,5,2};
int k = -2;
System.out.print(Solution.longestSubsequence(num,k));
}
}