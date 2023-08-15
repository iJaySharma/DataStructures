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
public static boolean palindrome(ListNode head)
{
if(head==null || head.next==null) return true;

ListNode slow  = head;
ListNode fast = head;
ListNode pre = null;

while(fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;
}
while(slow!=null)
{
ListNode temp = slow.next;
slow.next = pre;
pre = slow;
slow = temp;
}

while (pre != null) {
            if (head.key != pre.key) return false;
            head = head.next;
            pre = pre.next;
        }
return true;
}

public static void main(String[] gg)
{
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(2);
l1.next.next.next = new ListNode(2);
System.out.println(Solution.palindrome(l1));
}
}