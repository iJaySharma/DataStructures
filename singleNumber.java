import java.io.*;

class Solution 
{
public static int singleNumber(int[] nums)
{
int n = nums.length;
int result=0;
for(int i=0; i<n; i++)
{
result^=nums[i];
}

return result;
}
public static void main(String[] gg)
{
int[] nums = new int[]{1,2,2,1,4};
int res = singleNumber(nums);
System.out.print(res);
}
}