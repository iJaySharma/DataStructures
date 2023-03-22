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
public static ListNode addNumber(ListNode l1, ListNode l2) {
         int tempValue = 0;
        ListNode newNode = new ListNode();
        ListNode tempNode = newNode;
        while(l1 != null || l2 != null)
        {
            if(l1 != null){
                tempValue += l1.key;
                l1 = l1.next;
            }
            if(l2 != null){
                tempValue += l2.key;
                l2 = l2.next;
            }

            tempNode.next = new ListNode(tempValue % 10);
            tempNode = tempNode.next;
            tempValue /= 10;
        }
        if(tempValue > 0)
            tempNode.next = new ListNode(tempValue);
        return newNode.next;
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
System.out.println(res.key);
res = res.next;
}
}
}