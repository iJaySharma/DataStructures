import java.util.*;
class Solution
{
public static int[] function(int[] nums)
{
Stack<Integer> st = new Stack<>();
for(int i=0; i<nums.length; i++)
{
if(nums[i]<=0)
{
while(!st.isEmpty() && st.peek()>0 && st.peek()<nums[i]*-1) st.pop();

if(!st.isEmpty() && st.peek()==nums[i]*-1) st.pop();
else if(!st.isEmpty() && st.peek()>0 && st.peek()>nums[i]*-1) continue;
else st.push(nums[i]);
}
else st.push(nums[i]);
}

int n = st.size();
int[] ans = new int[n];

for(int i=n-1; i>=0; i--)
{
ans[i]=st.pop();
} 

return ans;
}
public static void main(String[] gg)
{
int[] nums = new int[]{5,2,-5};
int[] ans = Solution.function(nums);

for(int i=0; i<ans.length; i++)
{
System.out.println(ans[i]);
}
}
}