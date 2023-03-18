class Solution
{
static boolean function(int[][] matrix,int target)
{
int r=0,c=matrix[0].length-1;
while(r<matrix.length && c>=0)
{
if(matrix[r][c]==target) return true;
else if(matrix[r][c]<target) r++;
else c--;
}
return false;
}
public static void main(String[] gg)
{
int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
int target = 14;
boolean res = function(matrix,target);
System.out.println(res);
}
}