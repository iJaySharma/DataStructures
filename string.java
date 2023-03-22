import java.util.*;
class Solution 
{
public static void main(String[] gg)
{
String s = "HELLO";
System.out.print(s);
s.substring(2);
System.out.print(s);
s.concat("world");
System.out.print(s);
String d = new String("HELLO");
System.out.print(s==d);
System.out.print(s.equals(d));
char[] arr = new char[]{'j','a','y'};
String ss = new String(arr);
System.out.print(ss);
Scanner sc = new Scanner(System.in);
int u = sc.nextInt();
System.out.print(u);
}
}