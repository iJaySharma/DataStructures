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
class Solution {
    public static int size(ListNode head){
        if(head==null){
            return 0;
        }
        if(head.next == null){
            return 1;
        }
         int p =0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            p++;
        }
    return p; }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next ==null){
            return head;
        }
        
        ListNode pre = null;
        ListNode curr = head;
        ListNode Next= null;
        int count = 0;
        while( curr!= null && count<k){
           Next = curr.next;
           curr.next = pre;
           pre=  curr;
           curr = Next;
           count++;
        }
        if(Next!=null && size(Next)>=k){
            head.next = reverseKGroup(Next,k);
        }
        else{
            head.next = Next;
        }
   return pre; }
public static void main(String[] gg)
{
ListNode l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(3);
l1.next.next.next = new ListNode(4);
l1.next.next.next.next = new ListNode(5);
int k = 2;
ListNode ans = Solution.reverseKGroup(l1,k);
while(ans!=null)
{
System.out.print(ans.key);
ans=ans.next;
}
}
}