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
public class RemoveDuplicates {
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static Node removeDupl(Node head)
    {
        if(head==null)
        {
            return null;
        }
        HashSet<Integer> set1=new HashSet<>();
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            if(set1.contains(curr.data))
            {
                prev.next=curr.next;
            }
            else
            {
                set1.add(curr.data);
                prev=curr;
            }
            curr=curr.next;

        }
        return head;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Node tail=null;
        System.out.println("Enter n nodes");
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
         System.out.println("Displaying nodes ");
         printList(head);
        
         System.out.println("Remove Duplicates");
         head=removeDupl(head);
         printList(head);
         sc.close();

        
        
    }
    
}
