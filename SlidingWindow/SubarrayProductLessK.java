// sliding window or bruteforce

import java.util.*;
import java.io.*;
class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k <= 1)return 0;
        
        int prod=1;
        int result=0;
        
        int left=0;
        int right=0;
        
        while(right<nums.length){
            prod*=nums[right];
            
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            
            result += right -left + 1; 
            right++;
        }
        return result;
    }


public static void main(String[] gg)
{
int[] nums = new int[]{10,5,2,6};
int k =100;
int res=numSubarrayProductLessThanK(nums,k);
System.out.println(numSubarrayProductLessThanK(nums,k));
}
}

//time complexity O(N)