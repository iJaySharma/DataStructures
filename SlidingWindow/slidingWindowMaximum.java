import java.util.*;
class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deq = new ArrayDeque<>();
        int sz = nums.length, result[] = new int[sz - k + 1], idx = 0;
        for(int indx = 0; indx < sz; indx++){
            int currNum = nums[indx];
            while(!deq.isEmpty() && deq.peekLast() < indx - k + 1){
               deq.pollLast();
            }
            while(!deq.isEmpty() && nums[deq.peekFirst()] < currNum){
               deq.pollFirst();
            }
            deq.offerFirst(indx);
            if(indx + 1 >= k){
                result[idx++] = nums[deq.peekLast()];  
            }
        }
        return result;
    }
public static void main(String[] gg)
{
int[] num = new int[]{1,3,-1,-3,5,3,6,7};
int k = 3;
int s = num.length;
int[] ans = new int[s-k+1];
ans = Solution.maxSlidingWindow(num,k);
for(int i: ans)
{
System.out.println(i);
}
}
}