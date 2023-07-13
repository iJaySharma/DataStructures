import java.util.*;
class Solution {
    static boolean cycle = false;

    public static boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] edgelist: prerequisites){
            int u = edgelist[1];
            int v = edgelist[0];

            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[n];
        boolean[] currentPath = new boolean[n];

        for(int i=0;i<n;i++){
            dfs(i, graph, visited, currentPath);
        }


        return !cycle;
    }


    public static void dfs(int v, ArrayList<ArrayList<Integer>> g, boolean[] vis, boolean[] cur){
        if(cur[v]){
            cycle = true;
        }

        if(vis[v] || cycle){
            return;
        }

        vis[v] = true;
        cur[v] = true;

        for(int adj: g.get(v)){
            dfs(adj, g, vis, cur);
        }

        cur[v] = false;
    }
public static void main(String[] gg)
{
int[][] pre = new int[][]{{1,0}};
int k = 2;
System.out.print(canFinish(k,pre));
}
}