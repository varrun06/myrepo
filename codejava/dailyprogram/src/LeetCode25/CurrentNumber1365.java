// 5
package LeetCode25;

public class CurrentNumber1365 {

	public static void main(String[] args) {
		
		int nums[] = {8,1,2,2,3};
		
		for (int i=0;i<nums.length;i++) {
			int count = 0 ;
			for (int j=1;j<nums.length;j++) {
				
				if(nums[i] > nums[j]) {
					count++;
				}
				
			}
		
			
System.out.println("Numbers Are Smaller Than the Current Number "+ nums[i] +"="+ count);                      
					 
		
	}
		
}
}