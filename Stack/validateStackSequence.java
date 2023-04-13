import java.util.*;
class Solution {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>(); // Create a stack
        
        int j = 0; // Intialise one pointer pointing on popped array
        
        for(int val : pushed){
            st.push(val); // insert the values in stack
            while(!st.isEmpty() && st.peek() == popped[j]){ // if st.peek() values equal to popped[j];
                st.pop(); // then pop out
                j++; // increment j
            }
        }
        return st.isEmpty(); // check if stack is empty return true else false
    }
public static void main(String[] gg)
{
int[] num1 = new int[]{1,2,3,4,5};
int[] num2 = new int[]{4,5,3,2,1};
System.out.println(validateStackSequences(num1,num2));
int[] nums1 = new int[]{1,2,3,4,5};
int[] nums2 = new int[]{4,3,5,1,2};
System.out.println(validateStackSequences(num1,num2));
}
}