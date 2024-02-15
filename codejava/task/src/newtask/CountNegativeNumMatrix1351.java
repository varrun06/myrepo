package newtask;

public class CountNegativeNumMatrix1351 {

	public static void main(String[] args) {

		int arr [][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("The number of negative integers in the matrix is: " + count);
	}
}
