import java.util.*;
import java.io.*;

class Solution {
    public static int minimumDeviation(int[] nums) {
        
PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

int min = Integer.MAX_VALUE;

for(int i: nums)
{
    if(i%2==1)i=i*2;
    pq.add(i);
    min = Math.min(min,i);
}

int diff = Integer.MAX_VALUE;

while(pq.peek()%2==0)
{
int max = pq.remove();
diff = Math.min(diff,max-min);
min=Math.min(max/2,min);
pq.add(max/2);
}

return Math.min(pq.peek()-min,diff);
    
    }
public static void main(String[] gg)
{
int[] nums = new int[]{1,2,3,4};
int ans =  minimumDeviation(nums);
System.out.println(ans);
}

}