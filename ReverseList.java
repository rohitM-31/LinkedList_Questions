

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
public class ReverseList {
    public static void PrintList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    

    }
    public static int MiddleNode(Node head)
    {
        Node fast=head;
        
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public static Node ReverseL1(Node head)
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Nodes");
        Node head=null;
        Node tail=null;
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            
             Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;

            }
            else{
            
            tail.next=newNode;
            tail=newNode;
            }



        }
        sc.close();
        System.out.println("print the orginal list");
        PrintList(head);
        System.out.print("Reverse the list");
        head=ReverseL1(head);
        PrintList(head);
        System.out.print("Middle Elemenet of the list");
        int mid=MiddleNode(head);
        System.out.println(mid);

        
    }
}
