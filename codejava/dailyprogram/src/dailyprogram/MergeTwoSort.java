//Program 20: Merge Two Sort
package dailyprogram;

public class MergeTwoSort {
	 public static void main(String[] args) {
		int[] s1 = {1,5,6};
		int[] s2 = {10,12,4};
		
//		int[] s3 = new int[6];
//
//		
//		
//		for (int i = 0; i < s1.length; i++) {
//            
//			for (int j = 0; j < s2.length; j++) {
//				
//				if ()
//			}
//            
//		}
        
		int[] s3 = new int[6];
		
		int count = 0;
		for(int i=0; i<s1.length; i++) {
			s3[count] = s1[i];
			count++;
			s3[count] = s2[i];
			count++;
		}
		for(int i=0; i<6; i++) {
			System.out.println(s3[i]);
		}
		
       
    }
}