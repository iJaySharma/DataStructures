// hashing and sliding window

import java.util.*;
import java.io.*;

class Solution
{
 public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    int slen = s.length(), plen = p.length(), count = plen;
    int[] table = new int[256];
    
    for (char ch: p.toCharArray()) {
        table[ch]++;
    }
    
    int left;
    for (int j = 0; j < slen; j++) {
        if (table[s.charAt(j)]-- > 0) {
            count--;
        }
        
        left = j - plen + 1;
        if (count == 0) {
            res.add(left);
        }

        if (left >= 0) {
            if (table[s.charAt(left)]++ >= 0) {
                count++;
            }
        }
    }
    return res;
}

public static void main(String gg[])
{
String s = "abab";
String p = "ab";
List<Integer> res= new ArrayList<>();
res = findAnagrams(s,p);
for(int a : res)
{
System.out.print(a);
}
}
}

// Time Complexity O(lenght of s)
/*
public List<Integer> findAnagrams(String s, String needle) {
        int start =0 , end =0;
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Character , Integer> hm = new HashMap<>();
        for (char c:needle.toCharArray()){
            hm.put(c , hm.getOrDefault(c,0)+1);
        }
        int count = needle.length();

        while (end < s.length()){
            char c = s.charAt(end);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) - 1);
                if (hm.get(c) >= 0) {
                    count--;
                }
            }

            while (start < s.length() && count == 0){
                 char temp = s.charAt(start);
                 if (hm.containsKey(temp)){
                     hm.put(temp , hm.get(temp)+1);
                     if (hm.get(temp) > 0) {
                         count++;
                         if (end - start + 1 == needle.length()) {
                             al.add(start);
                         }
                     }
                 }
                 start++;
                }
                end++;
            }

        return al;
    }
*/