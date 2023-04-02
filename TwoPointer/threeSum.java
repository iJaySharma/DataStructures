//two pointers

import java.io.*;
import java.util.*;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
     
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left= i+1;
            int right = nums.length-1;
            while(left<right){
                int currentSum = nums[i]+nums[left]+nums[right];
                if(currentSum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left+=1;
                    right-=1;
                while (left < right && nums[right] == nums[right + 1]) right--;
                }
                
                
                else if(currentSum<0){
                    left+=1;
                }
                else if(currentSum>0){
                    right-=1;
                }
            }
        }
        return result;
    }

public static void main(String gg[])
{
int[] nums = new int[]{-1,0,1,2,-1,-4};
List<List<Integer>> res = new ArrayList<List<Integer>>();
res = threeSum(nums);
System.out.println(res);
}
}

//time complexity O(N2)
//space complexity O(1)
