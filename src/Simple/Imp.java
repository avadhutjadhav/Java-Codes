package Simple;

public class Imp {
	// Fibonacci Series
	public static void main1(String[] args) {
		int n1=0, n2=1, n3;
		int N=10;
		System.out.print(n1+" "+n2+" ");
		for(int i=0; i<N;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		
		}
	}
	
	//Prime Number
	public static void main(String[] args) {
		int n=11;
		int f=0;
		if(n==0 || n==1) {
			System.out.println("not prime number1");
		}else {
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					System.out.println("Number is not prime");
					f++;
					break;
				}
			}
			if(f==0) {
				System.out.println("Number is prime");
			}
		}
	}
	//Palindrom
	public static void main3(String[] args) {
		int n=1235321;
		int t=n, reverse=0, d;
		
		while(n>0) {
			d=n%10;
			reverse=reverse*10+d;
			n=n/10;
		}
		
		System.out.println(reverse);
		
		if(reverse==t) 
			System.out.println("Number is palindrom");
		else 
			System.out.println("Number Not is palindrom");
		
	}
	//GCD
	public static void main4(String[] args) {
			int x=12, y=18, gcd=1;
			for(int i=1; i<=x && i<=y; i++) {
				if(x%i==0 && y%i==0) 
					gcd=i;
						
			}System.out.println(gcd);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
