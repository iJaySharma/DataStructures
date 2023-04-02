import java.io.*;

class Solution
{
public static boolean canJump(int[] nums)
{
 boolean [] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        for(int k = nums.length-2; k >= 0; k--)
        {
            int furthestJump = Math.min(k + nums[k], nums.length-1);
            for(int j = k + 1; j <= furthestJump; j++)
            {
                if(dp[j] == true) 
                {
                    dp[k] = true;
                    break;
                }
            }
        }
        return dp[0];

}

public static void main(String[] gg)
{
int[] nums = new int[]{3,2,1,0,4};
boolean res = canJump(nums);
System.out.println(res);
}
}