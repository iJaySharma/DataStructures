import java.io.*;

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


public static boolean isSymmetric(Node root) {
       return root == null || isMirror(root.left, root.right);
    }

public static boolean isMirror(Node node1,Node node2) {
        if (node1 == null && node2 == null) return true;
        
        if (node1 == null || node2 == null) return false;
        
        if (node1.key != node2.key) return false;
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(2);
tree.root.left.left = new Node(3);
tree.root.left.right = new Node(4);
tree.root.right.left = new Node(4);
tree.root.right.right = new Node(3); 
boolean res = isSymmetric(tree.root);
System.out.println(res);
}
}