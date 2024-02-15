//Program 10: Fibonacci series
package com.company;

public class Fibonacciseries2 {

	public static void main(String[] args) {

		int n=50;

		int a =0;
		int b =1;

		for(int i=0;i<=n;i++) {


			int c = a+b;

			a=b;
			b=c;

			System.out.print(a + ", ");
		}
	}

}
