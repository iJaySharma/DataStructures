// backtracking 

import java.util.*;
import java.io.*;

class Solution {
    public static  List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0, nums, nums.length, ans, temp);
        
        return ans;
    }
    
    static void solve(int index, int[] nums, int n, List<List<Integer>> ans, List<Integer> temp){
            ans.add(new ArrayList<>(temp));
        
        for(int i = index; i<n; i++){
            
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            solve(i+1, nums, n, ans, temp);
            //backtrack
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[]gg)
    {
    int[] nums= new int[]{1,2,2};
    List<List<Integer>> ans = new ArrayList<>();
    ans = subsets(nums);
    System.out.println(ans);   
    }   
}

    
    






//Time Complexity O(2*N)