package Simple;


public class Trial{
	
	public static void main(String[] args) {
		int []arr = {10,20,30,40,50,60};
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println("element at "+i+" : "+arr[i]);
			}
		}
	}
	
}