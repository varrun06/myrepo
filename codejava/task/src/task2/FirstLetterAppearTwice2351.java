package task2;

public class FirstLetterAppearTwice2351 {

	public static void main(String[] args) {

		String s = "abccbaacz";
		char []arr =s.toCharArray();

		Object out = null ;


		for(int i=0; i< arr.length;i++) {

			for(int j=0; j<i ;j++) {

				if (arr[i] == arr[j]) {

					out = arr[i];
				}
			}


		}

		System.out.println(out);
	}

}
