import java.util.Scanner;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int d)
    {
        this.data=d;
        this.next=null;
    }
}
public class RotateByK {
    public static void printList(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static ListNode rotateRight(ListNode head,int k)
    {
        int len=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
           
            temp=temp.next;
             len++;
        }
        temp.next=head;
        k=k%len;
        int stepsHead=len-k;
        ListNode newTail=head;
        for(int i=0;i<stepsHead-1;i++)
        {
            newTail=newTail.next;

        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
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
        System.out.println("Enter k to rotate value");
        int k=sc.nextInt();
        head=rotateRight(head,k);
        printList(head);
        sc.close();

        
    }
}
