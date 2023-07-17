import java.util.*;
class ListNode
{
int val;
ListNode next;
public ListNode()
{
}
public ListNode(int key)
{
this.val = key;
}
public ListNode(int key,ListNode next)
{
this.val=key;
this.next=next;
}
}
class Solution
{
public static ListNode addNumber(ListNode l1, ListNode l2) {
          Stack<Integer> s1 = new Stack<>();
          Stack<Integer> s2 = new Stack<>();
          while (l1!=null){
             s1.add(l1.val);
             l1=l1.next;
          }
          while (l2!=null){
            s2.add(l2.val);
            l2=l2.next;
          }
          int sum = 0; int carry = 0; ListNode ans = null;
          ListNode newNode;
          while (!s1.isEmpty() || !s2.isEmpty()){
              if(!s1.isEmpty()) sum+=s1.pop();
              if(!s2.isEmpty()) sum+=s2.pop();
              sum+=carry;
              carry = sum/10;
              newNode = new ListNode(sum%10);
              newNode.next = ans;
              ans = newNode;
              sum = 0;
          }
          if (carry!=0) {
              newNode = new ListNode(carry);
              newNode.next = ans;
              ans = newNode;
          }
          return ans;
}
public static void main(String[] gg)
{
ListNode l1 = new ListNode(2);
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);

ListNode l2 = new ListNode(5);
l2.next = new ListNode(6);
l2.next.next = new ListNode(4);

ListNode res = addNumber(l1,l2);

while(res!=null)
{
System.out.println(res.val);
res = res.next;
}
}
}