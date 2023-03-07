import java.io.*;
import java.util.*;

class Solution
{

public static int Subsequence(String P,String Q,int m,int n,int count)
{
if(m==0 || n==0)
{
return 0;
}

else if(P.charAt(m-1)==Q.charAt(n-1))
{
count =  Subsequence(P,Q,m-1,n-1,count+1);
}
else
{
count = Math.max(count,Math.max(Subsequence(P,Q,m-1,n,0),Subsequence(P,Q,m,n-1,0)));
}
return count;
}

public static void main(String[] gg)
{
String a = "ACDFGE";
String b = "AGCDFG";
int m = a.length();
int n = b.length();
int res = Subsequence(a,b,m,n,0);
System.out.println(res);
}
}