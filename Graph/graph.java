import java.util.*;
import java.io.*;

class Solution
{
static class Edge
{
int src;
int dest;
int wt;
public Edge(int s,int d,int w)
{
this.src=s;
this.dest=d;
this.wt=w;
}
}

public static void createGraph(ArrayList<Edge> graph[])
{
for(int i=0; i<graph.length; i++)
{
graph[i] = new ArrayList<Edge>();
}

graph[0].add(new Edge(0,2,2));

graph[1].add(new Edge(1,2,10));
graph[1].add(new Edge(1,3,0));

graph[2].add(new Edge(2,0,2));
graph[2].add(new Edge(2,1,10));
graph[2].add(new Edge(2,3,-1));

graph[3].add(new Edge(3,1,0));
graph[3].add(new Edge(3,2,-1));

}

public static void main(String[] gg)
{
int V=4;

ArrayList<Edge> graph[] = new ArrayList[V];
createGraph(graph);
// printing neighbour of 2 vertec/node

for(int j=0; j<graph[2].size(); j++)
{
Edge e = graph[2].get(j);
System.out.println(e.src+" "+e.dest+" "+e.wt);
}
}
}