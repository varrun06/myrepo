package WorkOut;

import java.util.Scanner;

public class SortTheInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter how many number to sort");
		int s = input.nextInt();
		System.out.println("Enter the numbers");
		int num[] = new int[s];


		for (int i = 0;i<s;i++){

			num[i]=input.nextInt();


		}

		for (int i = 0;i<num.length-1;i++) {

			for (int j = 0;j<num.length-i-1;j++) {

				if(num[j+1] < num[j]){

					int  temp = num[j];
					num [j] = num[j+1];
					num[j+1] = temp;


				}


			}
		}

		System.out.println("after sorting");
		for (int i=0;i < num.length; ++i ) {

			System.out.println(num[i]);
		}


		int max =0;

		for (int i=0;i < num.length; i++ ) {

			if(max < num[i]) {

				max= num[i];
			}

		}
		

		System.out.println("find max num " + max);
		
		int sum =0;
		
		for (int i=0;i < num.length; i++ ) {
			
			sum = sum +num[i];
		}
		
		System.out.println("total num sum  "+ sum);
		System.out.println("average  "+ sum/s);
	}

}
