package pattern;


public class Program {
		public static void main1(String []args){
		int n=4;
		   for(int row=1;row<=n;row++){
		        for( int col=1;col<=row;col++)
		                {
		                  System.out.print("*");
	                    }
	         System.out.println();
	       }
	}

         public static void main2(String []args){
           int n=5;
           		for(int row=1;row<=n;row++){
           			for(int col=1;col<=n+1-row;col++){
           				System.out.print("*");
           			}
           			System.out.println();
           		}
         }


         	public static void main3(String []args){
         		int n=5;
         		for(int row=1;row<=n;row++){
         			for(int col=1;col<=n;col++){
         				System.out.print("*");
         			}
         			System.out.println();
         		}
         	}
         	
         	public static void main4(String []args){
         		int n=5;
         		for(int row=1;row<=n;row++){
         		  for(int col =1;col<=row;col++){
         		      System.out.print(col);
         		}
         		System.out.println();
         		}
         }
        public static void main5(String[]args){
				int n=6;
				for(int row=0;row<=2*n;row++){
					int totalcol=row>n?2*n-row:row ;
					for(int col=0;col<=totalcol;col++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
        public static void main6(String[]args){
    		int n=6;
    		for(int row=1;row<=n;row++) {
    		for(int col=1; col<=row;col++){
    				System.out.print("*");
    		     }
    		System.out.println();
    		}
    		for(int row=1;row<=n;row++){
       			for(int col=1;col<=n-row;col++){
       				System.out.print("*");
       			}
       			System.out.println();
       		}
        }
//        public static void main7(String []args){
//     		int n=5;
//     		for(int row=1;row<=n;row++){
//     		  for(int col =2*(n-row);col<=0;col--){
//     		      System.out.print(col);
//     		}
//     		System.out.println();
//     		}

        //Important Pattern
        public static void main(String[] args) {
        	
    		int N =4;
    	for(int i=1; i<=N; i++) {
    		for(int j=1; j<=N-i;j++) {
    			System.out.print(" ");
    		}
    		for(int k=1; k<=i;k++) {
    			System.out.print("*");
    		}
    		for(int m=1; m<=i-1;m++) {
    			System.out.print("*");
    		}
    		System.out.println("");
    		
    	}
     }
}