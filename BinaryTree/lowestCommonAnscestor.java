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
Node node;
public BinaryTree()
{
root = null;
}

public static Node lowestCommonAncestor(Node root,Node p,Node q)
{
if(root==null) return null;
Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if (root == p || root == q) return root;
        if (left == null) return right;
        if (right == null) return left;
        return root;
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
BinaryTree tr = new BinaryTree();
tr.node =  lowestCommonAncestor(tree.root,tree.root.left.right,tree.root.right.right);
System.out.print(tr.node.key); 
}
}