package String;

import java.util.Scanner;

public class Program {
  	     public static void main1(String[] args) {
  	    // Write a Java Program to reverse a string without using String inbuilt function.
	          String str = "Automation in industry";
	          StringBuilder str2 = new StringBuilder();
	          str2.append(str);
	          System.out.println("After append = " + str2);
	          str2 = str2.reverse();     // used string builder to reverse
	         System.out.println("After reverse = " + str2);
	          }
  	   
  	   public static void main2(String[] args) {
  	        String str = "Saket Saurav";
  	        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
  	        for(int i= chars.length-1; i>=0; i--) {
  	            System.out.print(chars[i]);
  	        }
  	    }
  	   
  	  public static void main3(String[] args) {
         String str;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your String");
         str = sc.nextLine();
         String[] token = str.split("");    //used split method to print in reverse order
         for(int i=token.length-1; i>=0; i--)
         {
             System.out.print(token[i] + "");
         }
      }
  	 public static void main4(String[] args) {
        String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
    }
  	
  	//Write a Java Program to find the duplicate characters in a string.
  	 public static void main(String[] args) {
        String str = new String("Sakkett");
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i<str.length();i++) {
                    for(int j=i+1; j<str.length();j++) {
                               if (chars[i] == chars[j]) {
                                          System.out.print(chars[j] + "  ");
                                          count++;
                                          System.out.println(count);
                                          break;
                                }
                     }
         }
 }
  	// Write a Java Program to remove all white spaces from a string without using replace(). 
  	public static void main6(String[] args)
    {
        String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
  
        char[] chars = str1.toCharArray();
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
}
/*
	//Compare Two Strings
	
	public static void main(String[] args)
	{
		String s1,s2;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String : ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		if(s1.compareTo(s2)>0)
			System.out.println("First string is greater than Second");
		else if(s1.compareTo(s2)<0)
			System.out.println("First string is smaller than Second");
		else
			System.out.println("Both strings are equal");
	}
}	
*/
	
	
	
	
	
	
	
	
	



