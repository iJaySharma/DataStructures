import java.util.*;
class Solution
{
static List<List<String>> findAnagram(String[] strs)
{
if(strs.length == 0)  return new ArrayList<>();
        
        Map<String, List> res = new HashMap<>();
        
        for(String str : strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            
            if(!res.containsKey(key))
                res.put(key, new ArrayList<>());
            
            res.get(key).add(str);
        }
        return new ArrayList(res.values());
}

public static void main(String[] gg)
{
String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};
System.out.println(findAnagram(str));
}
}