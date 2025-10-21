import java.util.*;
class Node{
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}

class Main {
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data+"->");
            curr=curr.next;
        }
    }
    public static Node getCommon(Node head1,Node head2)
    {
        HashSet<Integer> set1=new HashSet<>();
        Node dummy=new Node(-1);
        Node tail=dummy;
        Node temp1=head1;
        while(temp1!=null)
        {
            set1.add(temp1.data);
            temp1=temp1.next;
            
        }
        Node temp2=head2;
        while(temp2!=null)
        {
            if(set1.contains(temp2.data))
            {
                tail.next=new Node(temp2.data);
                tail=tail.next;
                set1.remove(temp2.data);
            }
            temp2=temp2.next;
        }
        return dummy.next;
        
    }
   
    public static void main(String[] args) {
        Node head1=new Node(1);
         head1.next=new Node(2);
           head1.next.next=new Node(3);
             head1.next.next.next=new Node(4);
            printList(head1);
             Node head2=new Node(3);
       head2.next=new Node(4);
           head2.next.next=new Node(5);
           head2.next.next.next=new Node(6);
           printList(head2);
           Node common=getCommon(head1,head2);
           printList(common);
        
        
       
         
         
          
          

        
          
          
        
    }
}
