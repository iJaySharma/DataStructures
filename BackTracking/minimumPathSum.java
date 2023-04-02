import java.io.*;
import java.util.*;

class Solution 
{
public static int pathSum(int[][] grid)
{
if(grid==null || grid.length==0)return 0;
        int ans = rec(0,0,grid);
        return ans;
    }
    public static int rec(int si,int sj,int grid[][]){
        int ei = grid.length-1;
        int ej = grid[0].length-1;
        if(si==ei && sj==ej)
            return grid[ei][ej];
        
        if(si>ei || sj>ej)return Integer.MAX_VALUE;
        
        int opt1 = rec(si+1,sj,grid);
        int opt2 = rec(si,sj+1,grid);
        
        return grid[si][sj]+Math.min(opt1,opt2);
}

public static void main(String[] gg)
{
int[][] num = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
int sum = pathSum(num);
System.out.print(sum);
}
}