import java.io.*;
import java.util.*;
class Solution 
{

public static int[] sortColor(int[] nums)
{
int a=0,b=0,c=0;
int n = nums.length;
for(int i=0; i<n; i++)
{
if(nums[i]==0)a++;
else if(nums[i]==1)b++;
else c++;
}
for(int p=0; p<a; p++)
{
nums[p]=0;
}
for(int q=a; q<a+b; q++)
{
nums[q]=1;
}
for(int r=a+b; r<a+b+c; r++)
{
nums[r]=2;
}
return nums;
}

public static void main(String[] gg)
{
int[] nums =  new int[]{1,2,0,0,2,1,2};
int[] res = sortColor(nums);
System.out.print(Arrays.toString(res));
}
}