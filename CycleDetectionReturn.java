class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class CycleDetectionReturn { 
    public static void printList(ListNode head)
    {
        int count=0;
        while(head!=null && count<20)
        {
            System.out.print(head.val+"->");
            head=head.next;
            count++;
        }
        System.out.println("null");
    }
    public static int DataCycleDetect(ListNode head)
    {
        if(head==null )
        {
            return -1;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                ListNode entry=head;
                while(entry!=slow)
                {
                    entry=entry.next;
                    slow=slow.next;
                }
                return entry.val;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next .next= new ListNode(6);
         head.next.next.next= head.next.next;
        printList(head);
        int value=DataCycleDetect(head);
        System.out.println(value);
        
    }
}

