import java.io.*;
import java.util.*;
 class Solution {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                if (nums[start] <= target && target<= nums[mid])
                    end = mid;
                else
                    start = mid;
            }
            else {
                if (nums[mid] <= target && target <= nums[end])
                    start = mid;
                else
                    end = mid;
            }
        }
        if (nums[start] == target)
            return start;
        else if (nums[end] == target)
            return end;
        else
            return -1;
    }

public static void main(String gg[])
{
int[] nums = new int[]{4,5,6,7,0,1,2};
int target = 0;
int res = search(nums,target);
System.out.println(res);
}
}

//time O(logn)