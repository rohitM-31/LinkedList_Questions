class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReverseRecursion {
    public static ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }
    public static void printList(ListNode head)
    {
        while(head!=null)
        {
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next .next= new ListNode(6);
        printList(head);
        head=reverseList(head);
        System.out.println("Reverse a linked list");
        printList(head);
        
        
        
    }
    
}
