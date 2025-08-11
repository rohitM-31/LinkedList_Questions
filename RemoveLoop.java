class ListNode
{
    int val;
    ListNode next;
    ListNode(int d)
    {
        this.val=d;
        this.next=null;

    }
}
public class RemoveLoop {
    public static void printList(ListNode head)
    {
        while (head!=null) {
            System.out.print(head.val+"->");
            head=head.next;
            
        }
        System.out.println("null");
    }
    public static void  detectLoopHead(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Loop detected");
                removeLoopCycle(head,slow);
                return;

            }

        }
        System.out.println("Not a loop");

    }
    public static void removeLoopCycle(ListNode head,ListNode slow)
    {
        ListNode ptr1=head;
        ListNode ptr2=slow;
        while(ptr1.next!=ptr2.next)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr2.next=null;
        System.out.println("Loop removed successfully");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
          head.next.next.next.next.next = head.next.next.next;
       
       
       detectLoopHead(head);
       printList(head);
        
        
    }
    
}
