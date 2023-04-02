import java.util.*;
class Solution
{
static List<Integer> partitionLabel(String s)
{
int[] arr = new int[26];

for(int i=0;i<s.length();i++)
{
arr[s.charAt(i)-'a']=i;
}
int start = 0;
int j=0;
List<Integer>list = new ArrayList<>();
for(int i=0;i<s.length();i++)
{
j = Math.max(j,arr[s.charAt(i)-'a']);
if(i==j)
{
list.add(i-start+1);
start = i+1;
}
}
return list;
}

public static void main(String[] gg)
{
String s = "ababcbacadefegdehijhklij";
System.out.print(partitionLabel(s));
}
}