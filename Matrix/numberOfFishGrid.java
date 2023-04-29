class Solution {
    public static int findMaxFish(int[][] grid) {
        int maximum = 0;
            
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0;j<grid[0].length; j++)
            {
                if(grid[i][j]!=0)
                {
                maximum = Math.max(maximum,find(grid,i,j));
                }
                }
        }
        
        return maximum;
    }
    
    public static int find(int[][] grid,int r,int c)
        {
            if(r>=grid.length || r<0 || c>=grid[0].length || c<0 || grid[r][c]==0)return 0;
            
            int val = grid[r][c];
            grid[r][c] = 0;
            
            val+=find(grid,r, c + 1);
             val+=find(grid,r, c - 1);
             val+=find(grid,r+1,c);
             val+=find(grid,r-1,c);
            
            return val;
            
        }
public static void main(String[] gg)
{
int[][] grid = new int[][]{{2,3,0,1},{4,0,1,1},{0,0,0,1},{1,0,0,0,}};
System.out.print(findMaxFish(grid));
}
}