class Solution {
     public static int jump(int[] nums) {
        if(nums.length==1) return 0;
        int position = 0;
        int destination = 0;
        int steps = 0;
        for(int i=0;i<nums.length-1;i++){
            destination = Math.max(destination,nums[i]+i);
            if(i==position){
                position = destination;
                steps++;
            }
        }
        return steps;
    }

public static void main(String[] gg)
{
int[] arr = new int[]{2,3,1,1,4};
int res = jump(arr);
System.out.println(res);
}
}