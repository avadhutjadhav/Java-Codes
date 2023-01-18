import java.util.Scanner;

public class Program {
	public static void main1(String[]args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int gcd=1;
		for(int i=0; i>=x&& i>=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				gcd=i;
			}
			System.out.println("gcd: "+gcd);
		}
}
	public static void main2(String args[]) {
		int num = 121;
		int temp=num;
		int rev =0;
		while(num>0) {
			int i = num%10;
			rev = rev*10+i;
			num/=10;
		}
		System.out.println("reverse number is : "+rev);
		
	if(temp==rev) {
		System.out.println("number is palindrom");
	}
	else
		System.out.println("number is not palindrom");

	}
	
	public static void main3(String[] args) {
		String str = "Avadhut";
		StringBuilder s =new StringBuilder();
		s.append(str);
		System.out.println("original string is : "+s);
		s=s.reverse();
		System.out.println("reverse string is : "+s);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4,3,5};
		int count=0;
		for(int i =0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("duplicate element are : "+arr[j]);
					count++;
					System.out.println(count);
				}
			}
		}
		}
	public static void main5(String[] args) {
		String str ="Kfintech";
		char []ch = str.toCharArray();
		for(int i = ch.length-1; i>=0 ; i--)
			System.out.print(ch[i]);
		
	}
		
}