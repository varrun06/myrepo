package task2;

import java.util.Arrays;

public class TwoArraysEqual1460 {
	public static void main(String[] args) {

		int target[] = {1,2,3,4};
		int arr[] = {2,4,1,3};

		Arrays.sort(target);
		Arrays.sort(arr);

		boolean check =true;

		for (int i=0;i<target.length;i++) {

			if(target[i]!=arr[i]) {
				check = false;
			}
		}

		System.out.println(check);
	}


}
