import java.util.*;
class Solution {
   public static List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        subsetGenerate(n,k,1,ans,new ArrayList<>());
            return ans;
        
    }
    public static void subsetGenerate(int n, int k, int idx, List<List<Integer>> ans, List<Integer> ds){
        
        if(k==0){
            ans.add(new ArrayList<>(ds));
            return;
            
        }
        if(n==0){
            return;
        }
       
        for(int i=idx;i<=n-k+1;i++){
            
            ds.add(i);
            subsetGenerate(n,k-1,i+1,ans,ds);
            ds.remove(ds.size()-1);
      
        }
    }
public static void main(String[] gg)
{
int n = 4;
int k = 2;
System.out.println(Solution.combine(n,k));
}
}