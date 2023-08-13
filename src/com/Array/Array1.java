package com.Array;
import java.util.Scanner;




public class Array1 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the size");
	 int size = scan.nextInt();
		
		int numbers[] = new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the integer at the index " + i +" ");
			numbers[i]=scan.nextInt();
			
			
			
	}
		
		
	
   for(int j =0 ;j<size; j++) {
	   System.out.println("The numbers at the index " + j +" "+ numbers[j]);
	   

}
}
}
