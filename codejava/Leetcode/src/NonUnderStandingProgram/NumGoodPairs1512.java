//15
package NonUnderStandingProgram;
//counting
public class NumGoodPairs1512 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1,1,3};
		
		for(int i=0; i<nums.length;i++) {
			
			for(int j=i+1; j<nums.length;j++) {
				
				if((nums[i] == nums[j])&& (i<j)) {
					
					System.out.println( i+" "+j);
					
				}
			
				
			}
			
		}
		
	}

}
