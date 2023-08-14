import java.util.*;
class Solution {
    public static int findKthLargest(int[] nums, int k) {
        
        //Create a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Add all array element in the Priority Queue
        for(int ele : nums){
            pq.add(ele);
        }

        //remove first size - k min elements
        while((pq.size() - k) > 0){
            pq.poll();
        }
        //this will give the current top element in the Priority Queue
        return pq.peek();
    }
public static void main(String[] gg)
{
int[] num = new int[]{3,2,1,5,6,4};
int k = 2;
System.out.println(Solution.findKthLargest(num,k));
}
}