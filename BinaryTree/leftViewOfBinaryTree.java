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

class BinaryTree
{

Node root;
public BinaryTree()
{
root = null;
}
public static List<Integer> leftSideView(Node node)
{
List<Integer> res = new ArrayList<>();
leftSide(node,res,0);
return res;
}
public static void leftSide(Node node,List<Integer> list,int depth)
{
if(node==null) return;
if(depth==list.size())
{
list.add(node.key);
}
leftSide(node.left,list,depth+1);
leftSide(node.right,list,depth+1);
}
public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
//tree.root.right.left = new Node(6);
tree.root.right.right = new Node(7); 
List<Integer> list = new ArrayList<>();
list = leftSideView(tree.root);
System.out.print(list);
}
}