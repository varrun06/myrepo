//Program 35: HeightChecker
package HomeWork;

public class HeightChecker {
    
	public static void main(String[] args){
		
		int[] height = {1,3,2,1};
		
		for(int i=0;i<height.length;i++) {
		
		
		int temp;
		for(int j=0;j<height.length-1;j++) {
		if (height[j] > height[j+1]) {
			temp = height[j];
			height[j] = height[j+1];
			height[j+1] = temp;
		}
		}
		}
		
		
		
		for(int j=0;j<height.length;j++) {
			
			System.out.println(height[j] + "  ");	
			
		}
			
			
			
		}
		
		
	}
