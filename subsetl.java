// backtracking 

import java.util.*;
import java.io.*;

class Solution 
{

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        //result is [ [ ] ]
        return rec(result, 0, nums);
    }
    
    private static List<List<Integer>> rec(List<List<Integer>> result, int i, int[] nums){
        if(i==nums.length) return result;
    
        List<List<Integer>> newResult=new ArrayList<>(result);
        for(List<Integer> l:result){
            //for every item inside, append nums[i] or append empty. two choices in total
            List<Integer> l_mutate = new ArrayList<>(l);
            l_mutate.add(nums[i]);
            newResult.add(l_mutate);
        }
        return rec(newResult,i+1,nums);
    }

public static void main(String[]gg)
{
int[] nums= new int[]{1,2,3};
List<List<Integer>> ans = new ArrayList<>();
ans = subsets(nums);
System.out.println(ans);   
}   
}

//Time Complexity O(2*N)