package DataStructure;


	import java.util.Scanner;
	 
	public class LinearQueue {
	        private int q[],maxSize,front,rear;
	       
	        public void createQueue(int size)
	        {
	            maxSize=size;
	            front=0;
	            rear=-1;
	            q=new int[maxSize];
	        }
	       
	        public void Enqueue(int e)
	        {
	            rear++;
	            q[rear]=e;
	        }
	       
	        public boolean isEmpty()
	        {
	            if(front>rear)
	                    return true;
	            else
	                 return false;
	        }
	       
	        public boolean isFull()
	        {
	            if(rear==maxSize-1)
	                    return true;
	            else
	                 return false;
	        }
	      public int Dequeue()
	        {
	            int temp;
	            temp=q[front];
	            front++;
	            return temp;
	        }
	     
	      public void printQueue()
	      {
	          for(int i= front; i<=rear;i++) {
	              System.out.println(q[i]);
	          }
	             
	      }
	     
	        public static void main(String args[])
	        {
	            LinearQueue obj=new LinearQueue();//object
	            Scanner in =new Scanner(System.in);
	            System.out.println("Enter size of Queue:");
	            int size=in.nextInt();
	            obj.createQueue(size);//create stack
	            int ch;
	            do{
	                   System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.exit\n:");
	                   ch=in.nextInt();
	                   switch(ch)
	                   {
	                   case 1:
	                       if(obj.isFull()!=true)
	                       {
	                           System.out.println("Enter Element:");
	                           int e=in.nextInt();
	                           obj.Enqueue(e);
	                       }
	                       else
	                           System.out.println("Queue Full");
	                       break;
	                       
	                   case 2:
	                       if(obj.isEmpty()!=true)
	                       {
	                           int e=obj.Dequeue();
	                           System.out.println("Element out:"+e);                        
	                       }
	                       else
	                           System.out.println("Queue Empty");
	                       break;
	                       
	                   case 3:
	                       if(obj.isEmpty()!=true)
	                       {
	                          System.out.println("Elements in the Queue:");                        
	                          obj.printQueue();
	                       }
	                       else
	                           System.out.println("Queue Empty");
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



