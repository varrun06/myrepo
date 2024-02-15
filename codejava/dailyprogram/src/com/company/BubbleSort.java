//Program 8:Bubble sort
package com.company;

public class BubbleSort {

	public static void main(String[] args) {
		int[] s1 = {49,23,45,3,7,2,1,9,67,34};

		{ 
			int len = s1.length; 
			int i;
			int j;
			for (i = 0; i < len - 1; i++) {
				System.out.println("i value"+i);
			 
				for ( j = 0; j < len - i - 1; j++) {
					System.out.println("j value"+j);
				System.out.println("\n");
//				for(int j = i +1 ; j < len -1 ; j++)
				System.out.println(s1[j]);
				if (s1[j] > s1[j + 1]) { 

					
						int temp = s1[j]; 
						s1[j] = s1[j + 1]; 
						s1[j + 1] = temp; 
						
					} 
				}
			}
		} 



		int a = s1.length; 
		for (int i = 0; i < a; ++i) 
			System.out.print(s1[i] + " "); 
		System.out.println(); 

	}

}