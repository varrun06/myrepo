package NonUnderStandingProgram;
// 2
public class CountConsistentStrings1684 {

	public static void main(String[] args) {
		
		String[] words = {"ad","bd","aaab","baa","badab",};
		String allowed = "ab";

		
//		char[] s2 = allowed.toCharArray();
//		
//		for (int i=0;i<words.length;i++) {
//			char[] s1 = words[i].toCharArray();
//			
//		int count = 0;
//			
//			for (int j=0;j<s1.length;j++) {
//				
//				if ((s2[0] == s1[j] )||(s2[1] == s1[j] )) {
//					
//					count++;
//					
//				}
//				
//			}
//			
//				
//			
//			System.out.println(count);
//			
//		}
		
	
		boolean found = false;
		int count=0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(allowed)) {
				found = true;
				
				count++;
			}
		}
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
