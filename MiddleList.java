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
    Node head;
   
    public Node middleList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
       Node slow=head;
       Node fast=head;
       while(fast!=null&& fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
          
       }
       return slow;
       
        
    }
   
    public static void main(String[] args) {
        Main list=new Main();
        list.head=new Node(1);
         list.head.next=new Node(2);
         list.head.next.next=new Node(3);
          list.head.next.next.next=new Node(4);
          
          Node middle=list.middleList(list.head);
          System.out.println(middle.data);
          
          

        
          
          
        
    }
}
