import java.util.*;
class Solution
{
public static List<List<Integer>> function(int[] nums)
{
List<List<Integer>> result = new ArrayList<>();
result.add(new ArrayList<>());
return function2(result,0,nums);
}
public static List<List<Integer>> function2(List<List<Integer>> result,int i,int[] num)
{
if(i==num.length) return result;
List<List<Integer>> newResult = new ArrayList<>(result);
for(List<Integer> l: result)
{
List<Integer> l_mutate = new ArrayList<>(l);
l_mutate.add(num[i]);
newResult.add(l_mutate);
}
return function2(newResult,i+1,num);
}
public static void main(String[] gg)
{
int[] num = new int[]{1,3,4};
System.out.print(function(num));
}
}