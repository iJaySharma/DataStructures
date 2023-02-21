import java.util.*;
import java.io.*;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        int len = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            while (window.getOrDefault(ch, 0) > 0) {
                char leftChar = s.charAt(left++);
                window.put(leftChar, window.get(leftChar) - 1);
            }
            len = Math.max(len, right - left + 1);
            window.put(ch, 1);
            right++;
        }
        return len;
    }
public static void main(String[] gg)
{
String str = "pwwkew";
int ans = lengthOfLongestSubstring(str);
System.out.println(ans);
}

}