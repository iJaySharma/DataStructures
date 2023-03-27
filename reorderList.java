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
public static void reorderList(ListNode head)
{
ListNode slow = head, fast = head, prev = null;

while(fast!=null && fast.next!=null)
{
slow = slow.next;
fast = fast.next.next;
} 

ListNode curr = slow.next;
slow.next = null;

while(curr!=null)
{
ListNode nextNode = curr.next;
curr.next = prev;
prev = curr;
curr = nextNode;
}

ListNode curr1 = head;
ListNode curr2 = prev;

while(curr1!=null && curr2!=null)
{
ListNode next1 = curr1.next;
ListNode next2 = curr2.next;

curr1.next = curr2;
curr2.next = next1;


curr1 = next1;
curr2 = next2;

}

}

public static void main(String[] gg)
{
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next = new ListNode(4);
reorderList(l1);
}
}