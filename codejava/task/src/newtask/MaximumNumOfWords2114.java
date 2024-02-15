//13
package newtask;

public class MaximumNumOfWords2114 {

	public static void main(String[] args) {

		String s1[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
         int arr []= new int[s1.length]; 
		
		
		for (int i=0;i<s1.length;i++) {

			char[] s2 = s1[i].toCharArray();
			int Count=0;
			for (int j=0;j<s2.length;j++) {
				
				if (s2[j] == ' ') {
					Count++;
				}
				
			}
			
			int Total = Count + 1;
              arr[i]= Total;
			
		}
		
		int max =0;
		
		for (int i=0;i<s1.length;i++) {
			if(max < arr[i]) {
				
				max= arr[i];
			}
			
		}
		System.out.println("maximum number of words :"+ max);
	}

}
