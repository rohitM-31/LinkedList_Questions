
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

public class LinkedListDemo {
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.println("null.");
    }
    public static Node InsertBeg(Node head,int valueBeg)
    {
        Node newNode=new Node(valueBeg);
        newNode.next=head;
        return newNode;
    }
    public static Node InsertEnd(Node head,int valueEnd)
    {
        Node newNode=new Node(valueEnd);
        if(head==null)
        {
            return newNode;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;


        }
        curr.next=newNode;
        return head;
    }
    public static Node InsertMid(Node head,int data)
    {
        if(head==null)
        {
            return head;
        }
        Node curr=head;
        Node newNode=new Node(data);
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;

        }
        int mid=count/2;
        for(int i=0;i<mid-1&& curr!=null;i++)
        {
            curr=curr.next;

        }
        newNode.next=curr.next;
        curr.next=newNode;
        return head;


    }
    public static Node ReverseList(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node InsertPos(Node head,int pos,int valuePos)
    {
        if(pos==0)
        {
            return InsertBeg(head, valuePos);
        }
        Node newNode=new Node(valuePos);
        Node curr=head;
        for(int i=0;i<pos-1 && curr!=null;i++)
        {
            curr=curr.next;

        }
        if(curr==null)
        {
            System.out.println("pos out of inbox");
            return head;
        }
        newNode.next=curr.next;
        curr.next=newNode;
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
        System.out.println("list the linked list");
        printList(head);
        System.out.println("Adding element at the first");
        int valueBeg=sc.nextInt();
        head=InsertBeg(head,valueBeg);

        System.out.println("After adding head at the first");
        printList(head);
        System.out.println("Adding last element to the linked list");
        int valueEnd=sc.nextInt();
        head=InsertEnd(head,valueEnd);
        System.out.println("After adding the last element");
        printList(head);
        System.out.println("Adding at the particular position");
        int pos=sc.nextInt();
        int valuePos=sc.nextInt();
        head=InsertPos(head,pos,valuePos);
        System.out.println("After adding at particula position");
        printList(head);
        System.out.println("Insert in the middle Element");
        int valueMid=sc.nextInt();
        head=InsertMid(head,valueMid);
        System.out.println("After inserting at the middle");
        printList(head);
        System.out.println("Reverse the linked list");
        head=ReverseList(head);
        printList(head);
        sc.close();
    }
    
}
