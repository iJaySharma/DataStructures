import java.io.*;
import java.util.*;
class Solution {
    public static boolean search(int[] nums, int target) {
       int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            
            if (nums[mid]==target || nums[start]==target || nums[end]== target) return true;
            
            // if middle value, end value , and mid value all are same 
            //then we don't have sufficeint info to know which side to iterate next 
            if (nums[start]==nums[mid] && nums[mid]== nums[end]) {
                start++;
                end--;
                continue;
            }
            // either one side of mid should be perfectly sorted respect to mid
            //check which side of your mid is perfectly sorted and check respect to that which side we need to search next 
            if (nums[mid] > nums[start] ) {
                if (target < nums[mid] && target>nums[start])  end =mid -1;
                else start=mid+1;

            }else if(nums[mid]<nums[start]){

                if ( nums[mid]<target && nums[end]>target)  start= mid+1;
                else end= mid-1;
            }else start = mid+1;// nums[mid]==nums[start] and we checked it already that mid is not equal to target
        }
        return false;
        
    }
public static void main(String[] gg)
{
int[] num = new int[]{2,5,6,0,0,1,2};
int target = 3;
System.out.print(Solution.search(num,target));
}
}