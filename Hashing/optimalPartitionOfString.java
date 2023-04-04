import java.util.*;
class Solution
{
public static int function(String s)
{
int n = s.length();
        char[] cc = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        
   int ans = 1;
   

        for(int i=0; i<n; i++)
        {
           if(set.contains(cc[i]))
           {
               set.clear();
               ans++;
           }
           set.add(cc[i]);
        }

return ans;
}
public static void main(String[] gg)
{
String s = "abacaba";
System.out.print(function(s));
}
}