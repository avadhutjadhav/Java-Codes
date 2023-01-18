package Collection;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.Callable;


public class ArrayListDemo {
    public static void main1(String[] args) {
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Advanced For Loop:");
        for(Object obj : list) {
            System.out.println(obj);
    }
        System.out.println("For Loop:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
}
	
    public static void main(String[] args) {
		ArrayList I = new ArrayList();
		I.add("A");
		I.add(10);
		I.add("A");
		I.add(null);
		System.out.println(I);  //[A, 10, A, null]
		I.remove(2);
		System.out.println(I);   //[A, 10, null]
		I.add(2,"M");
		I.add("N");
		System.out.println(I);   //[A, 10, M, null, N]
	}
    
    public static void main3(String[] args) {
		ArrayList I = new ArrayList();
		LinkedList I2= new LinkedList();
		System.out.println(I instanceof Serializable);//true
		System.out.println(I2 instanceof Callable);//false
		System.out.println(I instanceof RandomAccess);//true
		System.out.println(I2 instanceof RandomAccess);//false
    }
    
}



