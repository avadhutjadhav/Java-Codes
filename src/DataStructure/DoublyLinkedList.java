package DataStructure;

import java.util.*;

class dnode
{
    int data;
    dnode left,right;
    dnode(int e)
    {
        data=e;
        left=right=null;
    }
}

class DLinkedList
{
    dnode root;
    
    void createLinkedList()
    {
        root=null;
        
    }
    
    void insertleft(int e)
    {
        dnode n=new dnode(e);
        if(root==null)
        {
            root=n;        
        }
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;//3
        }
    }
        
    void deleteleft()
    {
             
        if(root==null)
        {
          System.out.println("Empty List");
        }
        else
        {
            dnode t=root;//1
            root=root.right;//2
            root.left=null;//3
              System.out.println("Deleted:"+t.data);
        }
    }
    
   void insertright(int e)
    {
        dnode n=new dnode(e);
        if(root==null)
        {
            root=n;
            
        }
        else
        {
            dnode t=root;//1
            while(t.right!=null)//2
            {
                t=t.right;
            }
            t.right=n;//3
            n.left=t;//4
    }  
    }
   
 void deleteright()
    { 
        if(root==null)
        {
          System.out.println("Empty List");
        }
        else
        {
            dnode t=root;//1
            dnode t2;
            while(t.right!=null)//2
            {
                t=t.right;
            }
            if(t.left==null && t.right==null)
            {
            	root=null;
            	System.out.println("Deleted:"+t.data);
            	return;
            }
            t2=t.left;//3
            t2.right=null;//4
            System.out.println("Deleted:"+t.data);
        }
    }
 
    void print()
    { 
        if(root==null)
        {
          System.out.println("Empty List");
        }
        else
        {
            dnode t=root;//1
           while(t!=null)//2
            {
                System.out.printf("%d ",t.data);
                t=t.right;
            } 
         }
        
    }
        
}


public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLinkedList obj = new DLinkedList();
		Scanner in = new Scanner(System.in);
		obj.createLinkedList();

		int ch, e;
		
		do {
			System.out.println("\n1.InsertLeft\n2.DeleteLeft\n3.InsertRight\n4.DeleteRight\n5.Print\n0.exit\n:");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Element from insertleft ");
				 e = in.nextInt();
				obj.insertleft(e);
				break;
				
			case 2:
				System.out.println("Removed the data from left");
				obj.deleteleft();
				break;
				
			case 3:
				System.out.println("Enter the Element from insertright ");
				e = in.nextInt();
				obj.insertright(e);
				break;
				
			case 4:
				System.out.println("Removed the data from right");
				obj.deleteright();
				break;
				
			case 5:
				System.out.println("Elements on  Doubly LinkedList:");
				obj.print();
				break;
				
			case 0:
				System.out.println("Exiting program");
				break;
				
			default:
				System.out.println("wrong input");
				break;
				
			}
		}while(ch!=0);

	}

}





