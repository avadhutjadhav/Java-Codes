package Searching;

import java.util.Scanner;

public class Program {
	//Linear Search
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of array: ");
		int a=sc.nextInt();
		int []arr=new int[a];
		System.out.println("eneter the elements of array: ");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter value of key: ");
		int key=sc.nextInt();
		
		System.out.println(key+" is found at index: "+linearSearch(arr, key)); 
	}

}
/*
public static int find(int[] ar, int j) {
	for(int i=0; i<ar.length; i++) {
		if(ar[i]==j) {
			 return i; 
		}
	} 
		return -1;
}
public static void main(String[] args) {
	int[] arr=new int [] {10,2,33,44,53,23};
	int N=53;
	
	System.out.println(find(arr,N));
	
}
*/