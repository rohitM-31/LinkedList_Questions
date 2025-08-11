import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int v) {
        this.val = v;
        this.next = null;
    }
}
public class NthNodeList {
    public static void printList(ListNode head)
    {
        
        while(head!=null)
        {
            System.out.print(head.val+"-> ");
            head=head.next;
        }
        System.out.println("null");

    }
    public static int NthNode(ListNode head,int n)
    {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++)
        {
            if(fast==null)
            {
                return -1;
            }
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
            
        }
        if(slow!=null)
        {
            return  slow.val;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next .next= new ListNode(6);
        printList(head);
        System.out.println("Enter the nth node");
        int n=sc.nextInt();
        int res=NthNode(head,n);
        if(res==-1)
        {
            System.out.println("the list has fewer nodex");
        }

        System.out.println(res);
        
        
    }
}
