import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class DeleteLinkedList {
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");

    }
    public static Node deleteAtBeg(Node head)
    {
        if(head==null)
        {
            System.out.print("No element in the list");
            return null;
        }
        return head.next;

    }
    public static Node deleteAtLast(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static Node deletePos(Node head,int pos)
    {
         if (head == null) {
        System.out.println("List is empty.");
        return null;
    }

    if (pos == 0) {
        return head.next;
    }

    Node curr = head;
    for (int i = 0; i < pos - 1 && curr.next != null; i++) {
        curr = curr.next;
    }

    if (curr.next == null) {
        System.out.println("Position out of bounds.");
        return head;
    }

    curr.next = curr.next.next;
    return head;
    }
    public static Node deleteMid(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        if(mid==0)
        {
            return head;
        }
        Node curr=head;
        for(int i=0;i<mid-1;i++)
        {
            curr=curr.next;
        }
        if(curr.next!=null)
        {
            curr.next=curr.next.next;
        }
        return head;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Node tail=null;
        System.out.println("Enter nodes");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }
        printList(head);
        System.out.print("Delete linked list at the beginning     ");
        head=deleteAtBeg(head);
        printList(head);
        System.out.print("Delect linked list at the last        ");
        head=deleteAtLast(head);
        printList(head);
        System.err.println("Delete Linked list in the middle");
        head=deleteMid(head);
        printList(head);
        System.out.println("Delete specific position in a linked list");
        int pos=sc.nextInt();
        head=deletePos(head,pos);
        printList(head);

        sc.close();

        
    }
}
