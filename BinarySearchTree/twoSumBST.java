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

public boolean function(Node root, int k) {
        Set<Integer> set = new HashSet<>(); // Create set 
        return preorder(root, set, k);      // Perform preorder traversal
    }
    public boolean preorder(Node root, Set<Integer> set, int k){
        if(root == null){ // If root is null 
            return false; // return false;
        }
        int countElement = k-root.key; // Calculate counter element 
        if(set.contains(countElement)){ // If set contains counter element 
            return true;                // return true;
        }
        set.add(root.key); // else add root element into set
        return preorder(root.left, set, k) || preorder(root.right, set, k); // Perform preorder traversal in the left and right child
    }

public static void main(String[] gg)
{
bstTree tree = new bstTree();
tree.root = new Node(5);
tree.root.left = new Node(3);
tree.root.right = new Node(7);
tree.root.left.left = new Node(1);
tree.root.left.left.right = new Node(2);
tree.root.left.right = new Node(4);
tree.root.right.left = new Node(8);
tree.root.right.right = new Node(6); 
System.out.print(tree.function(tree.root,25));
}
}