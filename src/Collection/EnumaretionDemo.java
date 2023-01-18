package Collection;

import java.util.*;

public class EnumaretionDemo {
	////EnumaretionDemo 
	public static void main1(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration e = v.elements();
		 while (e.hasMoreElements()) {
			 Integer i = (Integer)e.nextElement();
			 if((i%2)==0)
				 System.out.println(i);
		 }
		 
		 System.out.println(v);
	}
	
	///IteratorDemo 
	public static void main2(String[] args) {
		ArrayList I = new ArrayList();
		for(int i = 0; i<10; i++) {
			I.add(i);
		}
		System.out.println(I);
		Iterator itr = I.iterator();
		while(itr.hasNext())
		{
			Integer n=(Integer)itr.next();
			if(n%2==0)
				System.out.println(n);
		}
		System.out.println(I);
	}
	
	//ListIterator
	public static void main(String[] args) {
		LinkedList I = new LinkedList();
		I.add("balakrishna");
		I.add("chiru");
		I.add("venky");
		I.add("nag");
	System.out.println(I);
	
	ListIterator Itr = I.listIterator();
			while(Itr.hasNext()) {
				String s= (String) Itr.next();
				if(s.equals("venky")) {
					Itr.remove();
				}else if (s.equals("nag")) {
					Itr.add("chaitu");
				}else if (s.equals("chaitu")) {
					Itr.add("charan");
				}
			}
		System.out.println(I);
	}

}
