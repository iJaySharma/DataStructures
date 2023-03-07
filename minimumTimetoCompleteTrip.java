import java.io.*;
import java.util.*;

class Solution 
{
public static int minimumTime(int[] arr,int totalTrip)
{
int ans=0;
max=Math.MIN_VALUE;
int l=0;
for(int r: arr)
{
max=Math.max(max,r);
}
int r = max*totalTrip;

while(l<=r)
{
int mid = l + (r-l)/2;
if(compute(mid,arr,totalTrip))
{
ans = mid;
r=mid-1;
}
else
{
l=mid+1;
}
return l;
}

public static boolean compute(int val,int[] arr,int totalTrip)
{
int count=0;
for(int x: arr)
{
count+=val/x;
} 
if(count>=totalTrip) 
{
return true;
}
else
{ 
return false;
}
}

public static void main(String[] gg)
{
int[] num = new int[]{1,2,3};
int totalTrip = 5;
int res = minimumTime(num,totalTrip);
System.out.println(res);
}
}