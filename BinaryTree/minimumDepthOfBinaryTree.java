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

public static int minDepth(Node root) {
        if(root==null) return 0;
        int depth = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-->0)
            {
                root = q.poll();
                if(root.left==null && root.right==null) return depth;
                if(root.left!=null) q.add(root.left);
                if(root.right!=null) q.add(root.right);
            }
            depth++;
        }

        return depth;
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
System.out.print(BinaryTree.minDepth(tree.root));
}
}