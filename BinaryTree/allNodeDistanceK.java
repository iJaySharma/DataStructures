import java.io.*;
import java.util.*;
class TreeNode  
{
int val;
TreeNode left = null;
TreeNode right = null;
public TreeNode(int val)
{
this.val = val;
}
}

class BinaryTree
{

TreeNode root;
public BinaryTree()
{
root = null;
}

public static void getParentsByDFS(Map<TreeNode,TreeNode> parent,TreeNode root)
{
if(root==null) return;
if(root.left!=null) parent.put(root.left,root);
if(root.right!=null) parent.put(root.right,root);
getParentsByDFS(parent,root.left);
getParentsByDFS(parent,root.right);
}

public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent = new HashMap<>();
        getParentsByDFS(parent,root);
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode,Boolean> visited = new HashMap<>();
        visited.put(target,true);
        queue.add(target);
        int level = 0;
        while(!queue.isEmpty())
{
int n = queue.size();
if(level==k) break;
level++;
while(n-->0)
{
TreeNode curr = queue.poll();
if (curr.left != null && !visited.containsKey(curr.left)) {
                    visited.put(curr.left, true);
                    queue.add(curr.left);
                }
                if (curr.right != null && !visited.containsKey(curr.right)) {
                    visited.put(curr.right, true);
                    queue.add(curr.right);
                }
                if (parent.containsKey(curr) && !visited.containsKey(parent.get(curr))) {
                    visited.put(parent.get(curr), true);
                    queue.add(parent.get(curr));
}
}
    }
ArrayList<Integer> ans = new ArrayList<>();
while(!queue.isEmpty())
{
ans.add(queue.poll().val);
}
return ans;
}

public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new TreeNode(1);
tree.root.left = new TreeNode(2);
tree.root.right = new TreeNode(3);
tree.root.left.left = new TreeNode(4);
tree.root.left.left.left = new TreeNode(9);
tree.root.left.right = new TreeNode(5);
tree.root.right.left = new TreeNode(6);
tree.root.right.right = new TreeNode(7); 
int k = 1;
System.out.print(BinaryTree.distanceK(tree.root,tree.root.left,k));
}
}