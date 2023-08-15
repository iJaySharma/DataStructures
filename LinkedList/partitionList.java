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
public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode high = new ListNode(0);

        ListNode smallHead = small , highHead = high;

        while(head!=null)
        {
   if(head.val<x)
   {
       smallHead.next = head;
       smallHead = smallHead.next;
   }
   else 
   {
highHead.next = head;
highHead = highHead.next;
   }
   head = head.next;
        }
        highHead.next=null;
        smallHead.next = high.next;

        return small.next;
    }
public static void main(String[] gg)
{
ListNode l1 = new ListNode(1);
l1.next = new ListNode(4);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(2);
l1.next.next.next.next = new ListNode(5);
l1.next.next.next.next.next = new ListNode(2);
int k = 3;
ListNode ans = Solution.partition(l1,k);
while(ans!=null)
{
System.out.println(ans.val);
ans=ans.next;
}
}
}