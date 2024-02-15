//Program 60: SumOfUniqueElements2
package leetprogram;

import java.util.Arrays;
import java.util.HashMap; 
public class SumOfUniqueElements2 {
   
	
	public static int sumOfUnique(int[] nums) {
		
       
		HashMap<Integer,Integer> map = new HashMap<>();
		
        
		int ans = 0;
        for(int i=0;i<nums.length;i++){  
        	
       map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      
            if(map.get(nums[i])==1){
//                ans+=nums[i];
            	ans=ans+nums[i];
            }
           
           
           if(map.get(nums[i])==2){
  //                ans-=nums[i];
                ans=ans-nums[i];
           }
            
            
        }
        return ans;

        
    }  
    
    public static void main(String[] args) {
        int[] nums = {20,1,20,30,20,20};
        int result = sumOfUnique(nums);
        System.out.println("unique num: " + result); 
}

  
}	