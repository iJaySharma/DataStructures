class Solution {
    public static int diagonalPrime(int[][] nums) {
        
        int n = nums.length;
        int res = 0;
        
        for(int i=0; i<n; i++)
        {
         int  a = nums[i][i];
         int  b = nums[i][n-i-1];
            
            if(isPrime(a))
            {
                res = Math.max(a,res);
            }
            if(isPrime(b))
            {
                res = Math.max(b,res);
            }
        }
        return res;
    }
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int n =  num/2;
        for (int i=2; i<n; i++)
        {
            if(num%i==0)return false;
        }
        return true;
    }
public static void main(String[] gg)
{
int[][] nums = new int[][]{{1,3,9},{2,7,5},{4,8,11}};
System.out.print(diagonalPrime(nums));
}
}