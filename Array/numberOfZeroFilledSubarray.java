import java.util.*;
class Solution
{

static long function(int[] nums)
{
long subarray = 0L;
long count = 0L;

for(int i=0;i<nums.length;i++)
{
if(nums[i]==0)
{
count++;
}
else
{
subarray+=count*(count+1)/2;
count=0;
}
}
if(count>0)
{
subarray+=count*(count+1)/2;
}
return subarray;
}

public static void main(String[] gg)
{
int[] num = new int[]{0,0,0,2,0,0};
System.out.print(function(num));
}

}