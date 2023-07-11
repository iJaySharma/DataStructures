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


public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new TreeNode(1);
tree.root.left = new TreeNode(2);
tree.root.right = new TreeNode(3);
tree.root.left.left = new TreeNode(4);
tree.root.left.right = new TreeNode(5);
tree.root.right.left = new TreeNode(6);
tree.root.right.right = new TreeNode(7); 
}
}