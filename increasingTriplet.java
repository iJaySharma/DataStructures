class Solution 
{
static boolean function(int[] nums)
{
int max1 = Integer.MAX_VALUE;
       int max2 = Integer.MAX_VALUE;
       for(int n : nums) {
           if(n <= max1) max1 = n;
           else if(n <= max2) max2 = n;
           else return true;
       }
       return false;
}
public static void main(String[] gg)
{
int[] nums = new int[]{5,4,3,2,1};
boolean flag;
flag = function(nums);
System.out.println(flag);
}
}