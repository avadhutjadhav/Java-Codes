package String;

import java.util.HashMap;
import java.util.Map;

public class Prog {
	public static void main2(String args[]){  
		String s="nitin";  
		StringBuilder sb=new StringBuilder(s);  
		sb.reverse();  
		String rev=sb.toString();//converting StringBuilder to String  
		if(s.equals(rev)){  
		System.out.println("Palindrome String");  
		}else{  
		System.out.println("Not Palindrome String");  
		}  
}
	public static void main3(String[] args) {
		String str1="Avadhut";
		String str2="Avadhut";
		String str3= new String ("Avadhut");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		
		
	}
	public static void main4(String[] args) {
		String str= new String("AvadhutJadhav");
		str=str.toLowerCase();
		int count[]=new int[256];
		
		for(int i=0; i<str.length(); i++) {
			count[(int)str.charAt(i)]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) {
				System.out.println((char)i+" "+count[i]);
			}
		}
		
	}
	 public static void main(String[] args) {
		 String str= new String("Avadhut Jadhav");
			str=str.toLowerCase();
			str=str.replace(" ","");
			char[] ch=str.toCharArray();
			int count=0;
			Map m= new HashMap();
			for(int i=0; i<ch.length; i++) {
				count=0;
				for(int j=0; j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
					}
				}
				m.put(ch[i],count++);
			}System.out.println(m);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}