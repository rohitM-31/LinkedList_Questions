import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;

    }
}
public class EvenOdd
{
    Node head;
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newNode;
    }
    public void displayList( )
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void arrage()
    {
        if( head==null)
        {
            return;

        }
        Node evenHead=null;
        Node evenTail=null;
        Node oddHead=null;
        Node oddTail=null;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data%2==0)
            {
                if(evenHead==null)
                {
                    evenHead=evenTail=curr;
                }
                else
                {
                    evenTail.next=curr;
                    evenTail=evenTail.next;
                }
            }
            else
            {
                if(oddHead==null)
                {
                    oddHead=oddTail=curr;
                }
                else
                {
                    oddTail.next=curr;
                    oddTail=oddTail.next;
                }
            }
        }
        curr=curr.next;

    }
    public static void main(String[] args) {
        EvenOdd linked=new EvenOdd();
        linked.insert(17);
        linked.insert(20);
        linked.insert(13);
        linked.insert(80);
        System.out.println("Display list");
        linked.displayList();
        System.out.println("Even or Odd");
        linked.arrage();
        linked.displayList();

        
        

    }
}