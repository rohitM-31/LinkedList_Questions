import java.util.*;
class StackQueues{
    Queue<Integer> q1=new LinkedList<>();
   
    public void push(int data)
    {
        q1.add(data);
        for(int i=0;i<q1.size()-1;i++)
        {
            q1.add(q1.remove());
        }
        System.out.println(data+"is Stored");
    }
    public int pop()
    {
        return q1.remove();
    }
    public void display()
    {
        System.out.println("ELements");
        for(int num:q1)
        {
            System.out.println(num+" ");
        }
    }
    public void top()
    {
        if(isEmpty())
        {
            System.out.println("Queue is EMpty");
            return ;
        }
        System.out.println(q1.peek()+"Peek elements");
    }
    public boolean isEmpty()
    {
        return q1.isEmpty();
    }
    
    
}
class Main{
    public static void main(String args[])
    {
        StackQueues stack=new StackQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.top();
        System.out.println(stack.pop()+"is removed");
           stack.display();
        
        
    }
}