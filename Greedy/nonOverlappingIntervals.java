import java.util.*;
class Solution
{
public static int function(int[][] intervals)
{
if(intervals==null || intervals.length==0) return 0;
int ans=0;
Arrays.sort(intervals,(a,b) -> (a[0]-b[0]));
int end = intervals[0][1];

for(int i=1;i<intervals.length;i++)
{
if(end>intervals[i][0])
{
ans++;
end = Math.min(end,intervals[i][1]);
}
else 
{
end=intervals[i][1];
}
}
return ans;
}

public static void main(String[] gg)
{
int[][] nums = new int[][]{{1,2},{2,3},{3,4},{1,3}};
System.out.print(function(nums));
}
}