import java.util.*;
class Solution {
    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int no = nums[n-1];
        int sum = no;
        
        
        for(int i=1; i<k; i++)
        {
            no=no+1;
            sum=sum+no;
        }
        
        return sum;
        
    }
public static void main(String[] gg)
{
int[] num = new int[]{1,3,5,7};
int k=3;
System.out.print(maximizeSum(num,k));
}
}