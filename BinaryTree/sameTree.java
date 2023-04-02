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

public static boolean isSameTree(Node p,Node q) {
        if(p==null && q==null) {
            return true;
        }
        if(p==null||q==null || p.key!=q.key) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.root.right.left = new Node(6);
tree.root.right.right = new Node(7); 
boolean res = isSameTree(tree.root);
System.out.println(res);
}

}