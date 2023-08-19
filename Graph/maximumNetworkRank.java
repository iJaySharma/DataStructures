import java.util.*;
class Solution
{
public static int function(int[][] roads,int n)
{
int[]count = new int[n];
int[][]direct = new int[n][n];

for(int[] road: roads)
{
count[road[0]]++;
count[road[1]]++;
direct[road[0]][road[1]]=1;
direct[road[1]][road[0]]=1;
}

int rank = 0;
for(int i=0; i<n; i++)
{
for(int j=i+1;j<n;j++)
{
rank=Math.max(rank,count[i]+count[j] - direct[i][j]);
}
}
return rank;
}
public static void main(String[] gg)
{
int[][] roads = new int[][]{{0,1},{0,3},{1,2},{1,3}};
int n=4;
System.out.print(Solution.function(roads,n));
}
}