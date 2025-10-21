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
   
    public boolean hasCycleDetect(Node head)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
       Node slow=head;
       Node fast=head;
       while(fast!=null&& fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               return true;
           }
       }
       return false;
       
        
    }
   
    public static void main(String[] args) {
        Main list=new Main();
        list.head=new Node(1);
         list.head.next=new Node(2);
         list.head.next.next=new Node(3);
          list.head.next.next.next=new Node(4);
           list.head.next.next.next=list.head.next;
          if(list.hasCycleDetect(list.head))
          {
              System.out.println("Cycle Detected");
              
          }
          else
          {
              System.out.println("Cycle not Detected");
          }
          

        
          
          
        
    }
}
