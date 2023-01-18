package String;

import java.util.Scanner;

public class Basic {
	
	//Convert String to Int 
public static void main1(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enetr string: ");
	String s=sc.nextLine();
	System.out.println(s);
	
	int i=Integer.parseInt(s); 
	System.out.println(i);
	
	System.out.println("-----------------");
	System.out.println(s+100);  
	System.out.println(i+100);  //enetr number as string to avoid error
	
}
  //Convert Int to String
public static void main2(String[] args) {
	int i=200;  
	String s=String.valueOf(i);
	String b=Integer.toString(i);
	System.out.println(b);
	
	float f=Float.parseFloat("23.6");  
	System.out.println(f);
	
	String sb=String.valueOf(f);  
	String sbb=Float.toString(f);  
}
//STring to char
	public static void main3(String args[]){  
	String s="hello";  
	char ch=s.charAt(0);  
	System.out.println("1st character is: "+ch); 
	
	System.out.println("-------------");
	for(int i=0; i<s.length();i++){  
        char c = s.charAt(i);  
        System.out.println("char at "+i+" index is: "+c);  
    }   
	System.out.println("-------------");
	//The toCharArray() method of String class 
	//converts this string into character array.
	String s1="hello";    
	char[] chr=s1.toCharArray();    
	for(int i=0;i<chr.length;i++){    
	System.out.println("char at "+i+" index is: "+chr[i]);   
	}  
}  
	
	//char to string
	public static void main4(String[] args) {
		char c='M';    
		String s=Character.toString(c);  
		System.out.println("String is: "+s);    
		 
	}
	
	public static void main5(String args[]){  
		String s="hello";  
		Object obj=s;  
		System.out.println(obj);  
		  
		//Object to String
		Basic e=new Basic();  
		String s1=e.toString();  
		String s2=String.valueOf(e);  
		System.out.println(s1);  
		System.out.println(s2);  
		  
}
	//Char by using Scanner
	public static void main6(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the character: ");
		char c1=sc.next().charAt(0);
		int value= c1;
		System.out.println(" "+c1+" "+value);
		}
	
	public static void main7(String[] args) {
		char [] ch = new char[] {'a','s','c'};
		for (char i:ch) {
			System.out.println(i);
		}
		
	}
	
	
	
	
	
	
	
}










