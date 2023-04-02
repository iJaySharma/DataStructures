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
Node node;
public BinaryTree()
{
root = null;
}
/*
public static String Serialization(Node node)
{
BinaryTree tree = new BinaryTree();
if(root==null) return "";
Queue<Node> q = new LinkedList<>();
StringBuilder res = new StringBuilder();
q.add(root);
while(!q.isEmpty())
{
tree.node = q.poll();
if(node==null){
res.append("n ");
continue;
} 
res.append(node.key+" ");
q.add(node.left);
q.add(node.right);
}
return res.toString();
}

public static Node Deserialization(String data)
{

}
*/
public static void printTree(Node node)
{
BinaryTree tree = new BinaryTree();
if(root==null) return "";
Queue<Node> q = new LinkedList<>();
StringBuilder res = new StringBuilder();
q.add(root);
while(!q.isEmpty())
{
tree.node = q.poll();
if(node==null){
res.append("n ");
continue;
} 
res.append(node.key+" ");
q.add(node.left);
q.add(node.right);
}
System.out.print(res.toString);
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
//Node ans = tree.deserialization(tree.serialization(tree.root));
tree.printTree(tree.root);
}
}