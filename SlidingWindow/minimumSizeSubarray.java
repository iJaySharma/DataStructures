class Solution
{
public static int function(int[] nums,int k)
{
int i=0;
int j=0;
int temp=0;
int minLen=Integer.MAX_VALUE;
while(j<nums.length)
{
temp+=nums[j];
while(temp>=k)
{
temp-=nums[i];
minLen=Math.min(minLen,j-i+1);
i++;
}
j++;
}
return minLen==Integer.MAX_VALUE?0:minLen;
}
public static void main(String gg[])
{
int[] nums = new int[]{2,3,1,2,4,3};
int k=7;
System.out.print(Solution.function(nums,k));
}
}