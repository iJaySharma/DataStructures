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
static int max = 0;
    public static int DiameterOfTree(Node root) 
    {
        ter(root);
        return max;
    }
    
    public static int ter(Node root)
    {
        if(root == null) return 0;
        int left = ter(root.left);
        int right = ter(root.right);
        max = Math.max(max, left+right);
        return Math.max(left, right) + 1;
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
int res = DiameterOfTree(tree.root);
System.out.println(res);
}

}