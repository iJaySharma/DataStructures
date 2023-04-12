import java.util.*;
class Solution
{
public static String function(String path)
{
Stack<String> stack = new Stack<>();
    Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
    for (String dir : path.split("/")) {
        if (dir.equals("..") && !stack.isEmpty())
         stack.pop();
        else if (!skip.contains(dir))
         stack.push(dir);
    }
    StringBuilder res = new StringBuilder();
    while(!stack.isEmpty()){
            res.insert(0,stack.pop()).insert(0,"/");
        }
    return res.toString();
}
public static void main(String[] gg)
{
String a = "/a/./b/../../c";
System.out.print(function(a));
}
}