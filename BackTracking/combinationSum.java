import java.util.*;
class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
         List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,0,target,new ArrayList(),result);
        return result;
    }
    private static void backtrack(int[] cand,int start,int target,List<Integer> list, List<List<Integer>> result){
        if(target==0) result.add(new ArrayList(list));
        if(target<0) return;
        
        for(int i=start; i<cand.length; i++){
            list.add(cand[i]);
            backtrack(cand,i,target-cand[i],list,result);
            list.remove(list.size()-1);
        }
        
    }
public static void main(String[] gg)
{
int[] num = new int[]{2,3,6,7};
int target = 7;
System.out.print(Solution.combinationSum(num,target));

}
}