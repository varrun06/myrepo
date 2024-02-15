//Program 9:Bubble sort
package com.company;

public class BubbleSort3 {

	public static void main(String[] args) {

		int s1[] = {54,78,89,90,75,34};

		int len = s1.length;

		int i;
		int j;
		int temp;

		for (i=0;i < len -1; i++ ) {

			for (j=0;j < len -i-1; j++ ){

				if(s1[j+1] < s1 [j]) {

					temp = s1[j];
					s1 [j] = s1[j+1];
					s1[j+1] = temp;

				}
			}
		}
		int len2 = s1.length;	

		for (i=0;i < len2; ++i ) {

			System.out.println(s1[i]);
		}
	}

}
