class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LinkedListCycleDetection {
    public static boolean CycleDetect(ListNode head)
    {
        if(head==null)
        {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

      
        head.next.next.next= head.next.next;
        boolean res=CycleDetect(head);
        if(res)
        {
            System.out.println("Cycle is detected");
        }
        else
        {
            System.out.println("No cycle detected");
        }
    }
    
}
