import java.io.*;

class Solution 
{
public static int uniquePath(int[][] grid)
{
int row = grid.length;
int col = grid[0].length;

int[][] dp = new int[row][col];

boolean flag=false;
for(int i=0; i<row; i++)
{
if(flag || grid[i][0]==1)
{
flag=true;
dp[i][0]=0;
}
else dp[i][0]=1;
}

flag=false;
for(int i=0; i<col; i++)
{
if(flag || grid[0][i]==1)
{
flag=true;
dp[0][i]=0;
}
else dp[0][i]=1;
}

for(int i=1; i<row; i++)
{
for(int j=1; j<col; j++)
{
if(grid[i][j]==1)dp[i][j]=0;
else dp[i][j] = dp[i][j-1]+dp[i-1][j];
}
}
return dp[row-1][col-1];
}

public static void main(String[] gg)
{
int[][] arr = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
int res = uniquePath(arr);
System.out.println(res);
}
}