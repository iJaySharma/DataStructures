import java.io.*;
import java.util.*;

class Solution
{

public static int Subsequence(String P,String Q,int m,int n)
{
int[][] dp = new int[m][n];

for(int i=1;i<m;i++)
{
for(int j=1;j<n;j++)
{
if(P.charAt(i-1)==Q.charAt(j-1))
{
dp[i][j]=1+dp[i-1][j-1];
}
else 
{
dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
}
}
}
return dp[m-1][n-1];
}

public static void main(String[] gg)
{
String a = "abdceg";
String b = "abcdef";
int m = a.length();
int n = b.length();
int res = Subsequence(a,b,m,n);
System.out.println(res);
}
}
