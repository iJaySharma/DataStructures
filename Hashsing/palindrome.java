import java.util.*;
import java.io.*;
class Solution 
{
static int function(String g)
{
int len = 0;
Set<Character> set = new HashSet<>();
for(char c : g.toCharArray())
{
if(set.contains(c))
{
len+=2;
set.remove(c);
}
else
{
set.add(c);
}
}
return set.size() > 0 ? len+1 : len;
}

public static void main(String[] gg)
{
String s = "aavvbbcdd";
int res = function(s);
System.out.print(res);
}
}