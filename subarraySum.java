import java.util.*;
class Solution
{
static int function(int[] nums,int k)
{
int currentSum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        int count = 0;
        
        // iterate over the array
        for(int index = 0;index < nums.length;index++){
            currentSum += nums[index];
            
            // if prefix sum is present, add the occurances to count
            if(prefixSum.containsKey(currentSum - k)){
                count += prefixSum.get(currentSum - k);
            }
            
            prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
}

public static void main(String[] gg)
{
int nums[] = new int[]{1,2,3};
int k=3;
int res = function(nums,k);
System.out.println(res);
}
}