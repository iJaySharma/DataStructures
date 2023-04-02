//two pointers

class Solution {
    public static String backspace(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#' && sb.length()!=0){
                sb=sb.deleteCharAt(sb.length()-1);
            }
            else{
            sb.append(ch);
            }
        }
        return sb.toString().replaceAll("#","");  // if some # are left just before a string 
        // for eg "y#fo##f" "y#f#o##f"
    }
    public static boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

public static void main(String gg[])
{
String s = "ab#c";
String t = "ad#c";
boolean res = backspaceCompare(s,t);
System.out.println(res);
}
}

// time complexity O(N)