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
public void insertTail(int data)
{
    Node newNode=new Node(data);
    if(head==null)
    {
        head=newNode;
        return ;
    }
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newNode;
}
public void insertPos(int data,int pos)
{
    if(pos==1)
    {
        insertHead(data);
        return;
    }
    Node  newNode=new Node(data);
    Node temp=head;
    for(int i=1;temp!=null && i<pos-1;i++)
    {
        temp=temp.next;
    }
    newNode.next=temp.next;
    temp.next=newNode;
    
}
public void insertMid(int data)
{
    int len=0;
    Node newNode=new Node(data);
    Node curr=head;
    if(head==null)
    {
        head=newNode;
    }
    while(curr!=null)
    {
        len++;
        curr=curr.next;
    }
    int mid=len/2;
    curr=head;
    for(int i=1;i<mid;i++)
    {
        curr=curr.next;
    }
     newNode.next=curr.next;
     curr.next=newNode;
    
    
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
	  
	    System.out.println("Reverse List");
	    l.display();
	    l.insertTail(50);
	    l.display();
	    l.insertMid(25);
	    l.display();
	    l.insertPos(29,3);
	    l.display();
		
	}
}
