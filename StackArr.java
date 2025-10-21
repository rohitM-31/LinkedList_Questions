import java.util.*;
class Stack{
   private int size;
   private int top;
   private int[] arr;
   Stack(int s)
   {
       this.size=s;
       arr=new int[size];
       top=-1;
   }
   public void push(int data)
   {
       if(isFull())
       {
          System.out.println("Stack is Full");
          return;
       }
       arr[++top]=data;
       System.out.println(data+"is inserted");
       
   }
   public void pop()
   {
       if(isEmpty())
       {
           System.out.println("Stack is Empty");
           return;
       }
      
       System.out.println(arr[top--]+"ELement is Poped Out");
   }
   public void peek()
   {
       if(isEmpty())
       {
           System.out.println("Stack is Empty");
           return;
       }
       System.out.println(arr[top]+"is the peek element");
   }
   public void display()
   {
       for(int i=0;i<=top;i++)
       {
           System.out.println(arr[i]+" ");
       }
   }
   public boolean isFull()
   {
       if(top==size-1)
       {
           return true;
       }
       return false;
   }
   public boolean isEmpty()
   {
       if(top==-1)
       {
           return true;
       }
       return false;
   }
   
   
    
}
class Main{
    public static void main(String args[])
    {
        Stack stack=new Stack(6);
    stack.push(10);
    stack.push(20);
    stack.push(30);
     stack.push(40);
      stack.push(50);
       stack.push(60);
       System.out.println("Stack Elements");
    stack.display();
    System.out.println("POp elements");
    stack.pop();
     System.out.println("Stack Elements");
    stack.display();
    System.out.println("Peak Element");
    stack.peek();
    
        
    }
}