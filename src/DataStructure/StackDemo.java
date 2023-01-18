package DataStructure;
import java.util.*;
public class StackDemo {
	
	    private int s[],maxSize,tos;
	    
	    public void createStack(int size)
	    {
	        tos=-1;
	        maxSize=size;
	        s=new int[maxSize];
	    }
	    
	    public void push(int e)
	    {
	        tos++;
	        s[tos]=e;
	        System.out.println("Push Done");
	    }
	    
	    public boolean isFull()
	    {
	        if(tos==maxSize-1)
	            return true;
	        else
	            return false;
	    }
	    
	    public int pop()
	    {
	        int temp;
	        temp=s[tos];
	        tos--;
	        return(temp);
	    }
	    public boolean isEmpty()
	    {
	        if(tos==-1)
	            return true;
	        else
	            return false;
	     }
	    
	    public int atpeek()
	    {
	        return(s[tos]);
	    }
	    public void printStack()
	    {
	        for(int i=tos ;i>=0 ;i--)
	        {
	            System.out.println(s[i]);
	        }
	    }
	    public static void main(String args[])
	    {
	        StackDemo obj=new StackDemo();//object
	        Scanner in =new Scanner(System.in);
	        System.out.println("Enter size of Stack:");
	        int size=in.nextInt();
	        obj.createStack(size);//create stack
	        int ch;
	        do{
	               System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.exit\n:");
	               ch=in.nextInt();
	               switch(ch)
	               {
	                   case 1:
	                       if(obj.isFull()!=true)
	                       {
	                           System.out.println("Enter Element:");
	                           int e=in.nextInt();
	                           obj.push(e);
	                       }
	                       else
	                           System.out.println("Stack Full");
	                       break;
	                       
	                     case 2:
	                            if(obj.isEmpty()!=true)
	                            {
	                                int e=obj.pop();
	                                System.out.println("Element Poped:"+e);                        
	                            }
	                            else
	                                System.out.println("Stack Empty");
	                            break;
	                            
	                     case 3:
	                            if(obj.isEmpty()!=true)
	                            {
	                                int e=obj.atpeek();
	                                System.out.println("Element on Peek:"+e);                        
	                            }
	                            else
	                                System.out.println("Stack Empty");
	                            break;

	                    case 4:
	                                if(obj.isEmpty()!=true)
	                                {
	                                   System.out.println("Elements on stack:");                        
	                                   obj.printStack();
	                                }
	                                else
	                                    System.out.println("Stack Empty");
	                                break;
	                     case 0:
	                                System.out.println("Exiting program");                        
	                                break;
	                                
	                      default:
	                            System.out.println("Wrong input");                        
	                               break;
	                                      
	               }
	        }while(ch!=0);
	        
	    }
	    
	}


