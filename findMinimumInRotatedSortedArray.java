//Binary Search

import java.io.*;
import java.util.*;

class Solution
{

public static void main(String[]gg)
{
int[] nums = new int[]{3,4,5,1,2};
int res = search(nums);
System.out.println(res);
}

public static int search(int[] nums)
{
int start = 0;
int end = nums.length-1;
if(nums[start]<nums[end])
{
return nums[start];
}

while(start<end)
{
int mid = 0;
mid = start + (end - start)/2;
if(mid < end && nums[mid]>nums[mid+1]){
return nums[mid+1];
}
if(mid>start && nums[mid-1]>nums[mid]){
return nums[mid];
}
if(nums[start]<nums[mid]){
start=mid+1;
}
else {
end=mid-1;
}
}
return -1;
}
}

// time O(logN)