//two pointer / sliding window

import java.util.*;
import java.io.*;
class Solution 
{
public static int minSubArrayLen(int[] nums,int target) {
       int i=0,j=0;
        int temp = 0;
        int minLength = Integer.MAX_VALUE;
        while(j<nums.length) {
            temp += nums[j];
            while(temp>=target) {
                minLength=Math.min(minLength,j-i+1);
                temp-=nums[i];
                i++;
            }
            j++;
        }
        return minLength == Integer.MAX_VALUE? 0 : minLength; 
    }

public static void main(String[] gg)
{
int[] nums = new int[]{2,3,1,2,4,3};
int k = 7;
System.out.println(minSubArrayLen(nums,k));
}
}

//time complexity O(N)