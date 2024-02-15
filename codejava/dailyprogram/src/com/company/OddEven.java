//Program 12: add alternative numbers and sum the odd and even
package com.company;

public class OddEven {

	public static void main(String[] args) {

		int[] s1 = {10,7,8,5};
		int[] s2 = {1,11,7,2};

		int even =0;
		int odd =0;

		for (int i=0;i< s1.length;i++) {

			if(i % 2 == 0 ) {

				even = even + s1[i];
				
			}
			
			
			else {

				odd = odd + s1[i];
			}

		}
		
		int even1 =0;
		int odd1 =0;
		
		for (int i=0;i< s2.length;i++) {

			if(i % 2 == 0 ) {

				even1 = even1 + s2[i];
			}
			else {

				odd1 = odd1 + s2[i];
			}

		}


		System.out.println(odd);
		System.out.println(even);
		System.out.println(odd1);
		System.out.println(even1);
		
		int sum=0;
		int sum1=0;
		
		sum = odd + odd1;
		sum1 = even + even1;
		
		System.out.println(sum + " sum all odd number");
		System.out.println(sum1 + " sum all even number");
		
		
	}


}
