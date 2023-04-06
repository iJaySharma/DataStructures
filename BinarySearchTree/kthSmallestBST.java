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

public static int function(Node root,int k)
{
List<Integer> list = new ArrayList<>();
inOrder(root,k,list);
return list.get(k-1);
}
public static void inOrder(Node root,int k,List<Integer> list)
{
if(root!=null && list.size()<k)
{
inOrder(root.left,k,list);
list.add(root.key);
inOrder(root.right,k,list);
}
} 
public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(5);
tree.root.left = new Node(3);
tree.root.right = new Node(7);
tree.root.left.left = new Node(1);
tree.root.left.left.right = new Node(2);
tree.root.left.right = new Node(4);
tree.root.right.left = new Node(8);
tree.root.right.right = new Node(6); 
System.out.print(function(tree.root,3));
}
} 