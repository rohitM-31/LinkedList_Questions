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
    Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    void printList(Node node)
    {
        while(node!=null)
        {
            System.out.println(node.data+"->");
            node=node.next;
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Main list=new Main();
        list.head=new Node(1);
         list.head.next=new Node(2);
         list.head.next.next=new Node(3);
          list.head.next.next.next=new Node(4);
          list.printList(list.head);
          list.head = list.reverse(list.head);

        System.out.println("Reversed List:");
        list.printList(list.head);
          
          
        
    }
}
