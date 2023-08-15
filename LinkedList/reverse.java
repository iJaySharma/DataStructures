import java.util.*;
class ListNode
{
int key;
ListNode next;
public ListNode()
{
}
public ListNode(int key)
{
this.key = key;
}
public ListNode(int key,ListNode next)
{
this.key=key;
this.next=next;
}
}
class Solution
{
public static ListNode reverse(ListNode head)
{
ListNode pre = null;
ListNode curr = head;
while(curr!=null)
{
ListNode next = curr.next;
curr.next = pre;
pre = curr;
curr = next;
}
return pre;
}
public static void main(String[] gg)
{
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
ListNode ans = Solution.reverse(l1);
while(ans!=null)
{
System.out.println(ans.key);
ans = ans.next;
}
}
}