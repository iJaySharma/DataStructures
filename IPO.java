import java.util.*;
import java.io.*;

class Solution {
    static class Pair implements Comparable<Pair> {
        int capital, profit;

        public Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        public int compareTo(Pair pair) {
            return capital - pair.capital;
        }
    }
    
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Pair [] projects = new Pair[n];
        for(int i = 0;i<n;i++){
            projects[i] = new Pair(capital[i],profits[i]);
        }
        
        Arrays.sort(projects);
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>( Collections.reverseOrder());
        int j = 0;
        int ans = w;
        for(int i = 0;i<k;i++){
            while(j<n && projects[j].capital<=ans){
                priority.add(projects[j++].profit);
            }
            if(priority.isEmpty()){
                break;
            }
            ans+=priority.poll();
        }
        return ans;
    }

public static void main(String[] gg)
{
int k=2;
int w=0;
int[] profits = new int[]{1,2,3};
int[] capital = new int[]{0,1,1};
int ans = findMaximizedCapital(k,w,profits,capital);
System.out.println(ans);
}


}