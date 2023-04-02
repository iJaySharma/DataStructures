import java.util.*;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Sol
{

public static List<List<Integer>> zigZagTree(TreeNode root)
{
List<List<Integer>> ans = new ArrayList();
if(root==null) return null;
Queue<TreeNode> q
            = new LinkedList<>();
q.add(root);
int level = 1;
while(!q.isEmpty())
{
List<Integer> l = new ArrayList<>();
int c = q.size();
for(int i=0;i<c;i++)
{
TreeNode curr  = q.poll();
l.add(curr.val);
if(curr.left!=null)
{
q.add(curr.left);
}
if(curr.right!=null)
{
q.add(curr.right);
}
}
if(level==1)
{
ans.add(l);
level=0;
}
else
{
List<Integer> ll = new ArrayList<>();
for(int i =l.size()-1;i>=0;i--){
                    ll.add(l.get(i));
                }
                ans.add(ll);
}
return ans;
}
}

public static void main(String[] gg)
{
TreeNode root = new TreeNode();
root.val=3;
root.left.val = 9;
root.right.val = 20;
root.right.left.val = 15;
root.right.right.val = 7;
List<List<Integer>> res = new ArrayList<>();
System.out.print(zigZagTree(root));
}
}