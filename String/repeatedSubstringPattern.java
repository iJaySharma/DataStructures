import java.util.*;
class Solution{
public static boolean function(String s)
{
int len = s.length();
for(int i=len/2;i>=1;i--)
{
if(len%i==0)
{
int repeat = len/i;
String substring = s.substring(0,i);
StringBuilder sb = new StringBuilder();
for(int j=0; j<repeat; j++)
{
sb.append(substring);
}
if(sb.toString().equals(s)) return true;
}
}
return false;
}
public static void main(String[] gg)
{
String s = "abcdabcdabcd";
System.out.print(function(s));
}
}