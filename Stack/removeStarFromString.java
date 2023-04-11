import java.util.*;
class Solution {
    public static String removeStars(String l) {
     
        Stack<Character> s = new Stack<>();
        
        
        for (char c : l.toCharArray()) {
             if (c == '*') {
                s.pop();
            }
            
            else {
                s.push(c);
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        
     for (char c : s) {
            sb.append(c);
        }
        
    
        return sb.toString();
    }
public static void main(String[] gg)
{
String s = "tjkj**";
System.out.print(removeStars(s));
}
}