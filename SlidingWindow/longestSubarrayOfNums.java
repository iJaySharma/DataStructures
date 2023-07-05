class Solution {
    public static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;
        int start = 0;
        for(int i=0; i<nums.length; i++)
        {
            zeroCount+=nums[i]==0?1:0;
            while(zeroCount>1)
            {
                zeroCount-=nums[start]==0?1:0;
                start++;
            }
            longestWindow = Math.max(longestWindow,i-start);
        }
        return longestWindow;
    }
public static void main(String[] gg)
{
int[] nums = new int[]{0,1,1,1,0,1,1,0};
System.out.print(Solution.longestSubarray(nums));
}
}