//Program 15:Sum Of Unique Number Add
package com.company;

public class SumOfUniqueNumAdd {

	public static int sumOfUnique(int[] s1) {
		int[] count = new int[80]; 

		for (int s2 : s1) {
			count[s2]++ ;
		}



		int sum = 0;


		for (int i = 0; i < count.length; i++) {
			if (count[i] == 1) {
				sum += i;  
			}
		}
		return sum;

	}
	public static void main(String[] args) {


		int [] s1 = {2,4,5,5,7};
		
		int result = sumOfUnique (s1) ;
		System.out.println(result);
	}

}
