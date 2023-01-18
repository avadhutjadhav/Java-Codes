package DataStructure;


	import java.util.Scanner;
	 
	public class CircularQueue {
	       private int q[],maxSize,front,rear,count;
	       
	        public void createQueue(int size)
	        {
	            maxSize=size;
	            front=0;
	            rear=-1;
	            q=new int[maxSize];
	            count=0;
	        }
	       
	        public void Enqueue(int e)
	        {
	            rear=(rear+1)%maxSize;
	            q[rear]=e;
	            count++;
	        }
	       
	        public boolean isEmpty()
	        {
	            if(count==0)
	                    return true;
	            else
	                 return false;
	        }
	       
	        public boolean isFull()
	        {
	            if(count==maxSize)
	                    return true;
	            else
	                 return false;
	        }
	      public int Dequeue()
	        {
	            int temp;
	            temp=q[front];
	            front=(front+1)%maxSize;
	            count--;
	            return temp;
	        }
	     
	      public void printQueue()
	      {
	         int i=front;
	         int c =0;
	         while(c<count)
	         {
	             System.out.println(q[i]);
	             i=(i+1)%maxSize;
	             c++;
	         }
	             
	      }
	     
	        public static void main(String args[])
	        {
	            CircularQueue obj=new CircularQueue();//object
	            Scanner in =new Scanner(System.in);
	            System.out.println("Enter size of Circular Queue:");
	            int size=in.nextInt();
	            obj.createQueue(size);//create queue
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
	                         System.out.println("Elements in the Circular Queue:");                        
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

