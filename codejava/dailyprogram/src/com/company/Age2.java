//Program 6:Categorize based on constange age value
package com.company;

public class Age2 {

	public static void main(String[] args) {

		int age = 21;

		if (age < 9) {

			System.out.println("child");
		}
		else if ( ( age >=10) && (age <= 19)){

			System.out.println("tenage");
		}

		else if (( age <=20) && (age <=40)){

			System.out.println("mid age");
		}

		else {
			System.out.println("old age");
		}
	}

}
