package Collection;

import java.util.*;

public class LikedListDemo {
	public static void main1(String[] args) {
	LinkedList I =new LinkedList();
	I.add("Durga");
	I.add(30);
	I.add(null);
	System.out.println(I);
	I.set(0,"Software");
	I.add(0,"venky");
	I.removeLast();
	System.out.println(I);
	I.addFirst("CCC");
	System.out.println(I);
	}
}
