import java.io.*;
import java.util.*;

class Solution
{
public static void main(String[] gg)
{
int[] nums = new int[]{1,1,2,2,3,3,4,4};
int n = nums.length;
HashMap<Integer,Integer> map = new HashMap<>();
for(int i: nums)
{
map.put(i,map.getOrDefault(i,0)+1);
}

map.put(null,7);
map.put(5,null);
map.put(6,null);
map.put(null,8);
map.put(9);

Set<Integer> keySet = map.keySet();
        for(Integer key:keySet){
System.out.print(map.get(key));            
}
}
}