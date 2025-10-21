class LinkedList{
    class Node{
    int data;
    Node next;
    Node(int key)
    {
        data=key;
        next=null;
    }
}
Node head;
public void insertHead(int data)
{
   Node l1=new Node(data);
    l1.next=head;
    head=l1;
}
public void reverse()
{
    Node prev=null;
    Node next=null;
    Node curr=head;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}
public void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList l=new LinkedList();
	    l.insertHead(10);
	     l.insertHead(20);
	      l.insertHead(30);
	       l.insertHead(40);
	    l.display();
	    l.reverse();
	    System.out.println("Reverse List");
	    l.display();
		
	}
}
