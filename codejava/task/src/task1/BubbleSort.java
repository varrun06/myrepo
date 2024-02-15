package task1;

public class BubbleSort {

	public static void main(String[] args) {

		int[] s1 = {49,23,45,3,7,2,1,9,67,34};

		for (int i = 0; i < s1.length - 1; i++) {

			for ( int j = 0; j < s1.length - i - 1; j++) {

				if (s1[j] > s1[j + 1]) { 

					int temp = s1[j]; 
					s1[j] = s1[j + 1]; 
					s1[j + 1] = temp; 

				} 
			}
		}


		for (int i = 0; i < s1.length; ++i) 
			System.out.print(s1[i] + " "); 

	}

}
