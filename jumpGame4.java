import java.io.*;
import java.util.*;

class Solution 
{
public static int canJump(int[] nums)
{
int n = nums.length;
Map<Integer,List<Integer>> map = new HashMap<>();
for(int i=0;i<n;i++)
{
map.computeIfAbsent(nums[i],l -> new ArrayList<>()).add(i);
}

Queue<Integer> q = new LinkedList();
Set<Integer> visited = new HashSet<>();
int step=0;
q.add(0);
visited.add(0);

while(!q.isEmpty())
{
int size = q.size();
while(size-->0)
{
int i = q.poll();
if(n-1==i)return step;
List<Integer> adjList = map.get(nums[i]);
adjList.add(i-1);
adjList.add(i+1);
for(int j: adjList)
{
if(j>=0 && j<n && !visited.contains(j))
{
q.add(j);
visited.add(j);
}
}
adjList.clear();
}
step++;
}
return -1;
}
public static void main(String[] gg)
{
int[] nums = new int[]{100,-23,-23,404,100,23,23,23,3,404};
int res=canJump(nums);
System.out.print(res);
}
}