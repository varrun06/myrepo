package WorkOut;

public class BubbleSortTest {

	public static void main(String[] args) {
		
		int s1[]= {1,4,3,2};
		
		
		
		for (int i=0;i<s1.length-1;i++) {
			
			for (int j=0;j<s1.length;j++) {
				
				if(s1[i] > s1[j+1]) {
					
					s1[j] = s1[j+1];
				
				   int temp = s1[i];
				
				s1[i] = s1[j];
				s1[j] = temp;
				}
			}
				
		}
		
		for (int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
			
		}
	}
}
