
import java.util.*;
public class StackDemo 
{
  int stack[],tos,tos1,tos2,MaxSize1,MaxSize,size;
  void createStack(int size)
  {
   
      this.size=size; 
      stack=new int[size];
  }
  void createStack1()
  {
      tos1=-1;
      MaxSize1=size/2;
  }
  void createStack2()
  {
      MaxSize=size;
      tos2=MaxSize/2;
  }
  void push(int e)
  {
      tos1++;
      stack[tos]=e;
  }
  boolean isFull()
  {
      if(tos1==MaxSize1-1)
          return true;
      else
          return false;
  }
  int pop()
  {
      int temp=stack[tos];
      tos--;
      return(temp);
  }
  boolean isEmpty()
  {
      if(tos==-1)
          return true;
      else
          return false;
  }
  int peek()
  {
      return stack[tos];
  }
  
  void printStack()
  {
      for(int i=tos  ; i>-1 ; i--   )
          System.out.println(stack[i]);
  }
  
  public static void main(String args[])
  {
      int ch,e;
      StackDemo obj=new StackDemo();
      try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter size of stack:");
		  int s=in.nextInt();
		  
		  obj.createStack(s);
		  obj.createStack1();
		 
		
		  do
		  {
		       System.out.println("1.push\n2.pop\n3.peek\n4.print\n5.create stack2\n0.exit");
		       ch=in.nextInt();
		       switch(ch)
		       {
		           case 1:
		               if(!obj.isFull())//is not full
		               {
		                    System.out.println("Enter Data:");
		                    e=in.nextInt();
		                    obj.push(e);
		                    System.out.println("Pushed");
		               }
		               else
		                    System.out.println("Stack1 is Full use Stack2");
		               break;
		               
		            case 2:
		               if(!obj.isEmpty())//is not empty
		               {
		                    e=obj.pop();
		                    System.out.println("Poped:"+e);
		               }
		               else
		                    System.out.println("Stack Empty");
		               break;
		               
		             case 3:
		               if(!obj.isEmpty())//is not empty
		               {
		                    e=obj.peek();
		                    System.out.println("@ peek:"+e);
		               }
		               else
		                    System.out.println("Stack Empty");
		               break;  
		            
		             case 4:
		               if(!obj.isEmpty())//is not empty
		               {
		                    System.out.println("Stack has:");
		                    obj.printStack();
		               }
		               else
		                    System.out.println("Stack Empty");
		               break;  
		             case 0:
		                    System.out.println("Exiting ");
		                    break;
		             default:
		                    System.out.println("Wrong option selected");
		                    break;
		       }
		  }while(ch!=0);
	}
      }
      
          
  }
  
  