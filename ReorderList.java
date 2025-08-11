import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReorderList {
    public static void printList(ListNode head)
    {
       
        while(head!=null)
        {
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void reorderList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return ;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
           
        }
        ListNode sec=reverseList(slow.next);
        slow.next=null;
        ListNode first=head;
        while(sec!=null)
        {
            ListNode tmp1=first.next;
            ListNode tmp2=sec.next;
            first.next=sec;
            sec.next=tmp1;
            first=tmp1;
            sec=tmp2;
        }

    }
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        return prev;


    }
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original: ");
        printList(head);
        reorderList(head);
        printList(head);
    }
}
