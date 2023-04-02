import java.util.*;

class Solution 
{
public static boolean wordPattern(String str,String pattern)
{
String[] word = str.split(" ");
HashMap<Character,String> map1 = new HashMap<>();
HashMap<String,Boolean>map2 = new HashMap<>();

for(int i=0; i<word.length;i++)
{
if(map2.containsKey(pattern.charAt(i))==false)
{
if(map1.containsKey(word[i])==true)return false;
else
{
map2.put(word[i],true);
map1.put(pattern.charAt(i),word[i]);
}
}
else
{
String mword = map1.get(pattern.charAt(i));
if(mword.equals(word[i])==false)return false;
}
}
return true;
}

public static void main(String[] gg)
{
String pattern = "abba";
String str = "dog cat cat dog";
System.out.println(wordPattern(str,pattern));
}
}