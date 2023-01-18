package Array;

import java.util.*;

public class Program {
	//2D Array
	public static void main1(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter row and col :");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a= new int[row][col];
		System.out.println("Eneter the NUmbers : ");
		
			for(int i=0; i<row;i++) {
				for(int j=0; j<col;j++) {
					a[i][j] = sc.nextInt();
				}
			}
				System.out.println(Arrays.deepToString(a));
		}

//Array Example
	public static void main2(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]b=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i<=a; i++) {
			b[i]=sc.nextInt();
			
		}
		
		System.out.println("Elements in the array");
		for(int i=0; i<=a; i++) {
			System.out.println(b[i]+" ");
			}
	}
	
	//Array copy to another array
	public static void main3(String[] args) {
		int [] a1 = new int [] {1,2,3,4,5};
		int [] a2= new int[a1.length];
		
		for(int i=0; i< a1.length; i++) {
			a2[i]=a1[i];
		}
		System.out.println("Elements of original array: ");
		for(int i=0; i< a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("ELements of new array: ");
		for(int i=0; i< a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
	}
	
	//find the frequency of each element in the array
	public static void main4(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	        
	        int [] fr = new int [arr.length];  
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	  
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("----------------------------------------");  
	    }
	
	//print the duplicate elements of an array
	
	public static void main5(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                	System.out.println("duplicate elements are: "+arr[j]);
                   
            }  
	   }
	}	
	//print the elements of an array in reverse order
	public static void main6(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("reverse of array : ");
		for(int j=(arr.length-1); j>=0;j-- ) {
			System.out.print("  "+arr[j]);
		}
}
	//print the elements of an array present on even position
	public static void main7(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements on even position :");
		for(int j=1; j<arr.length;j+=2) {
			System.out.println("  "+arr[j]);
		}
	}
	//print the largest element in an array
	public static void main8(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0; i< arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
			
		}
		System.out.println("maximun value is: "+max);
	}
	
	//sum of array
	public static void main9(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i< arr.length; i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("sum of array is : "+sum);
	}
	
	//sort the element of array
	public static void main10(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//sort method of array 
		//Arrays.sort(arr);   
		
		int temp=0;
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
			}
			
		System.out.println("sorted array is ");
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
			}
		System.out.println("3rd largest element: "+arr[arr.length-3]);
	}
	
	//print Odd and Even Numbers from an Array
	public static void main11(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Odd Numbers:");  
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2!=0){  
		System.out.println(arr[i]);  
		}  
		}  
		
		System.out.println("Even Numbers:");  
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2==0){  
		System.out.println(arr[i]);  
		}  
		
	}
	}
	public static void main12(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array ");
		int a = sc.nextInt();
		int[]arr=new int[a];
		System.out.println("Enetr array elements : ");
		for(int i=0; i< arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i :arr) {
			System.out.print(" "+i);
		}
	}
	
	 //Highest 3 Numbers
	
		public static void main13(String[] args) {
			int arr[]=new int[]{1,2,33,44,3,32};
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]<arr[j]) {
						int t= arr[i];
						arr[i]=arr[j];
						arr[j]=t;
					}
				}
				
			}
			for(int k=0; k<3; k++) {
				System.out.println(arr[k]);
			}
			
		}
	
	
}
	

