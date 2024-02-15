//21
package NonUnderStandingProgram;
//Given an integer array nums, return the third distinct maximum number in this array. 
//		If the third maximum does not exist, return the maximum number.
public class ThirdDistinctMaximum {

	public static void main(String[] args) {

		int nums[] = {3,2,1,7,8,9,7,5,7,8,4,3};
		//		int nums[] = {2,2,3,1};
		for (int i=0;i<nums.length-1;i++) {

			for (int j=0;j<nums.length-i-1;j++) {

				if(nums[j] > nums[j+1]) {

					int temp = nums[j];

					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
			}
			
		}

		int len=nums.length;
		int s2[] = new int[len];

		int count=0;

		if(nums[0]!=nums[1]) {
			//System.out.println(nums[0]);
			s2[count++]=nums[0];
		}
		for ( int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {

				s2[count++]=nums[i];
				//System.out.println(nums[i]);
			}

		}

		int target = count-3 ;
		if(count>=3) {
			System.out.println("Third Maximum Number "+ s2[target]);
		}
		else {
			System.out.println("Third Maximum Number "+ s2[count]);
		}
	}
}