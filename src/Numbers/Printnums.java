1?package Numbers;

import java.util.Scanner;
/*
//print number from 1 to n
public class Printnums {
public static void main(String[] args) {
	System.out.println("enter value of n:");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    	System.out.println(i);
    }
}
}
*/

/*
 //REVERSE of N to 1
 public class Printnums{
	public static void main(String[] args) {
		System.out.println("enter value of n:");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
*/
/*
//sum of 1 to N number
 public class Printnums{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n:");
		int n= sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
*/
/*
//number is even or odd
public class Printnums
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of n:");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}
}
*/
/*
//Prime Number
public class Printnums {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n  = sc.nextInt();
		System.out.println("Prime numbers between 1 and "+n);
		
		for(int i=1;i<n;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
				
			}if(isPrime)
				System.out.println(i+"");
		}
	}
}
*/
/*
//number is Prime or not
public class Printnums{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number ");
		int n = sc.nextInt();
		int i;
		if(n==1)
		{
			System.out.println("Prime starts from 2 ");
		}
		for (i=2;i<n;i++)
		{
			if(n%i==0)
				System.out.println("not a prime");
				break;
			if(n==i)
			System.out.println("prime");
		}
	}
}
*/
/*
//LEAP year or not
public class Printnums{
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc= new Scanner(System.in);
		int m= sc.nextInt();
		
		if(m%4==0 && m%100!=0   ||  m%400==0)
			System.out.println("it is a leap year");
		else
			System.out.println("not a leap year");
	}
}
*/

// Program to swap two numbers using the third variable.
public class Printnums {
	public static void main1(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping"+" " + x +" " + y);
        
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping"+" " + x+" " + y);
    }
	 public static void main(String args[])
	   {
	      int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      y = in.nextInt();
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	     
	      x = x + y;
	      y = x - y;
	      x = x - y;
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	   }
	   

//Write a Java Program to check Armstrong number.
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
public class Printnums {
public static void main(String[] args)  {  
	   int c=0,a,temp;  
	   int n=153;					//It is the number to check Armstrong  
	   temp=n;  
	   while(n>0)  
	   {  
	   a=n%10;  
	   n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");  //output=armstrong number 
	    else 
	        System.out.println("Not armstrong number");   
	   }  
 }
*/
/*
//Palindrom number
public class Printnums{
	public static void main(String args[])
	{
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=n;
		int reverse=0;
		
		while(i>0)
		{
			int d=i%10;
			i=i/10;
			reverse = reverse*10 +d;
		}
		if(reverse==n)
		{
			System.out.println("palindrome number : "+n);
		}
		else {
			System.out.println("Not palindrome number : "+n);
		}
	}
}
*/
/*
 //Reverse the Number
 
public class Printnums{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n= sc.nextInt();
		int reverse=0;
		while(n>0)
		{
			 reverse = (reverse*10)+ n%10;
					n=n/10;
		}	
		System.out.println("reverse number is : "+reverse);

	}
}
*/
/*
 //Fibonacci Series
 
public class Printnums{
	public static void main(String[]args){
		int n1=0, n2=1, n3,count=10;
		System.out.print(n1+" "+n2+" ");
		for(int i=2; i<10;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	 }
	}
	*/
/*
	//Reverse fibonacci series
public static void main(String[] args) {
	int n1=0,n2=1,n3;
	int N=8;
	int []arr=new int[N+2];
	arr[0]=0;
	arr[1]=1;
	System.out.print(n1+" "+n2+" ");
	for(int i=0; i<N; i++) {
		n3=n1+n2;
		
			arr[i+2]=n3;
		
		
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		
}System.out.println();
	for(int k=N+1; k>=0; k--) {
		System.out.print(arr[k]+" ");
	}
	
}

*/


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
