
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MergeLinkList
{
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while (l1!=null && l2!=null) {
            if(l1.val<l2.val)
            {
                curr.next=l1;
                l1=l1.next;
            }
            else
            {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
            
        }
        if(l1!=null)
        {
            curr.next=l1;
            l1=l1.next;
        }
        else
        {
            curr.next=l2;
            l2=l2.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode merged)
    {
        ListNode curr=merged;
        while(curr!=null)
        {
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        //First Linked list:1->3->5
       ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Second linked list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode merged = mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
        



        
    }
}