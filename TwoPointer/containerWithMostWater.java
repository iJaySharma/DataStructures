// two pointer 

import java.*;
import java.util.*;
class Solution 
{
public static int find(int[] height)
{
int i =0;
int h =height.length-1;
int ans = Integer.MIN_VALUE;
while(i<h)
{
if(height[i]>height[h])
{
ans = Math.max(ans,height[h]*(h-i));
h--;
}
else 
{
ans = Math.max(ans,height[i]*(h-i));
i++;
}
}
return ans;
}
public static void main(String[] gg)
{
int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
int res = find(nums);
System.out.println(res);
}
}

// Time Complexity O(N)