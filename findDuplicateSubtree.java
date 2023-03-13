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

static List<Node> list;
static HashMap<String,Integer> map;

public static List<Node> findDuplicateSubtrees(Node root) {
list = new ArrayList<Node>();
map = new HashMap<>();
traverse(root);
return list;
}        

public static String traverse(Node node)
{
if(node == null)
{
return "$";
}

String subpath = node.key + "," + traverse(node.left) + "," + traverse(node.right);
System.out.println(subpath);

map.put(subpath,map.getOrDefault(subpath,0)+1);

if(map.get(subpath)==2)
{
list.add(node);
}

return subpath;
}

public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.right.left = new Node(2);
tree.root.right.left.left = new Node(4);
tree.root.right.right = new Node(4); 
List<Node> list = new ArrayList<Node>();
list = findDuplicateSubtrees(tree.root);
System.out.print(list);
}

}