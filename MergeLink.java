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
   
   
   public static void printList(Node head)
   {
       Node curr=head;
       while(curr!=null)
       {
           System.out.print(curr.data+"->");curr=curr.next;
       }
       
       
   }
   public static Node MergeLink(Node l1,Node l2)
   {
       Node dummy=new Node(-1);
       Node tail=dummy;
       while(l1!=null && l2!=null)
       {
           if(l1.data<=l2.data)
           {
               tail.next=l1;
               l1=l1.next;
           }
           else 
           {
               tail.next=l2;
               l2=l2.next;
           }
           tail=tail.next;
       }
       if(l1!=null)
       {
           tail.next=l1;
       }
       else
       {
           tail.next=l2;
       }
       return dummy.next;
       
   }
    public static void main(String[] args) {
       Node l1=new Node(1);
       l1.next=new Node(2);
       l1.next.next=new Node(3);
       l1.next.next.next=new Node(4);
          printList(l1);
             Node l2=new Node(1);
       l2.next=new Node(2);
       l2.next.next=new Node(3);
       l2.next.next.next=new Node(4);
          printList(l2);
          Node m=MergeLink(l1,l2);
          System.out.println("Merge Listr");
          printList(m);
         
         
          
          

        
          
          
        
    }
}
