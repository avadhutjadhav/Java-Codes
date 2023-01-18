package Simple;

public class Factorial {
	 static int fact(int N) {
		if(N==0) {
			return 1;
		}else
			return (N*fact(N-1));
	}
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(fact(n));
		
	}
}



/*
public class Factorial{
	public static void main(String[] args) {
		 int t=1;  
		  int number=6;   
		  for(int i=1;i<=number;i++){    
		      t=t*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+t);    
		 }  
}
*/




















