import java.io.*;
import java.util.*;
class Node  
{
int key;
Node left = null;
Node right = null;
public Node(int key)
{
this.key = key;
}
}

class bstTree
{

Node root;
public bstTree()
{
root = null;
}

public boolean function(Node node)
{
return isValid(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
}

public boolean isValid(Node root,int min,int max)
{
if(root==null)return true;
if(root.key>=max || root.key<=min) return false;
return isValid(root.left,min,max) && isValid(root.right,min,max);
}

public static void main(String[] gg)
{
bstTree tree = new bstTree();
tree.root = new Node(9);
tree.root.left = new Node(3);
tree.root.right = new Node(7);
tree.root.left.left = new Node(1);
tree.root.left.left.right = new Node(2);
tree.root.left.right = new Node(4);
tree.root.right.left = new Node(8);
tree.root.right.right = new Node(6); 
System.out.print(tree.function(tree.root));
}
}