import java.io.*;
import java.util.*;

class Solution 
{

public static int Subsequence(String P,String Q,int m,int n)
{
if(m==0 || n==0)
{
return 0;
}

if(P.charAt(m-1)==Q.charAt(n-1))
{
return 1 + Subsequence(P,Q,m-1,n-1);
}
else 
{
return Math.max(Subsequence(P,Q,m-1,n),Subsequence(P,Q,m-1,n-1));
}
}

public static void main(String[] gg)
{
String a = "abcde";
String b = "ace";
int m = a.length();
int n = b.length();
int res = Subsequence(a,b,m,n);
System.out.println(res);
}
}