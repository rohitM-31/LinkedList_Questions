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
public class DuplicateNumSorted {
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
    public static int findDuplicate(Node head)
    {
        // Node curr=head;
        // while(curr!=null && curr.next!=null)
        // {
        //     if(curr.data==curr.next.data)
        //     {
        //         System.out.println(curr.data);
        //     }
        //     curr=curr.next;
        // }    
        HashSet<Integer> set1=new HashSet<>();
        Node curr=head;
        while(curr!=null)
        {
            if(set1.contains(curr.data))
            {
                return curr.data;
            }
            set1.add(curr.data);
            curr=curr.next;
        }
        return -1;
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
        int duplicate = findDuplicate(head);
if (duplicate != -1) {
    System.out.println("Duplicate found: " + duplicate);
} else {
    System.out.println("No duplicates found.");
}


        sc.close();
        
    }
}
