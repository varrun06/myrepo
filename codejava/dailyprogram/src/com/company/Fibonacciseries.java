//Program 10: Fibonacci series
package com.company;

public class Fibonacciseries {

	public static void main(String[] args) {

		int n=10;
	 long[] arr = new long[n]; 
		 long a =0;
		long b =1;

	
		arr[0]=a;
		arr[1]=b;
		int count =2;
		while (count < n) {	
			
			long c = a+b;
			arr[count]=c;
			a=b;
			b=c;
			
			count++;

		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
