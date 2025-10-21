import java.util.*;
class Queue{
    private int size;
    private int front,rear;
    private int[] arr;
    Queue(int s)
    {
        size=s;
        front=0;
        rear=-1;
        arr=new int[size];
    }
    public void enqueue(int data)
    {
        if(isFull())
        {
           System.out.println("Queue is Full");
           return;
        }
        arr[++rear]=data;
        System.out.println(data+"is inserted");
        
    }
    public boolean isFull()
    {
        if(rear==size-1)
        {
            return true;
        }
        return false;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val=arr[front];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        return val;
    }
    public boolean isEmpty()
    {
        if(front>rear)
        {
            return true;
        }
        return false;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<rear;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public int peek()
    {
         if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
        
    }
}
class Main{
    public static void main(String args[])
    {
        Queue queue=new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Queue Elements");
        queue.display();
        System.out.println("Dequeue");
        queue.dequeue();
          System.out.println("Queue Elements");
          queue.display();
          System.out.println(queue.peek()+"peek element");
    }
}