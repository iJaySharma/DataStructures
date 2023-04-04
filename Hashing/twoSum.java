//Binary Search

import java.io.*;
import java.util.*;

class Solution {
public static int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for(int i=0; i<nums.length; i++){
        
       if( map.containsKey(target - nums[i])){
        result[1] = i;
        result[0] = map.get(target - nums[i]);
        return result;   
       }
        
        map.put(nums[i] , i);
    }
    return result;
}
public static void main(String gg[])
{
int[] nums = new int[]{2,7,11,15};
int[] res = new int[2];
int target = 9;
res = twoSum(nums,target);
System.out.println("["+res[0]+","+res[1]+"]");
System.out.println(Arrays.toString(res));
}

}
// time complexity O(n)
// space complexity O(1)