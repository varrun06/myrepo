//Program 9:Bubble sort
package com.company;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int[] s1 = {49,23,45,3,7,2,1,9,67,34};
		
		int len = s1.length ;
		
		for (int a = 0; a < len-1;a++ ) {
		
			for (int b = 0; b < len-a-1;b++ ) {
				
				if ( s1[b] > s1[b+1]) {
					
					int temp = s1[b];
					s1[b] = s1[b+1] ;
					s1[b+1] = temp;
				} 
			}
		
		}
		
		int len1 = s1.length ;
		for (int a = 0; a < len1 ;++a ){
			
			System.out.println(s1[a]);
			
		}	
	}
}