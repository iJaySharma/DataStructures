//Binary Search

import java.util.*;
import java.io.*;

class Solution {
    public static int findPeakElement(int[] nums) {
        int start= 0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end= mid;
            }
            else
            {
                start= mid+1;
            }
            
        }
        return start;
        
    }

public static void main(String gg[])
{
int[] nums = new int[]{1,2,3,1};
int res = findPeakElement(nums);
System.out.println(res);
}
}

// time O(logN)