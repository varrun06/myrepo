//Program 18: Alternative Number Add

package dailyprogram;


public class AlternativeNumberAdd {

	public static void main(String[] args) {
		int[] s1 = {10,1,5,12};
		int[] s2 = {15,1,4,-5};
		
		int even1 = 0, odd1 = 0;
		 
        
        for (int i = 0; i < s1.length; i++) {
            if (i % 2 == 0)
                even1 = even1 + s1[i];
            else
                odd1 = odd1 + s1[i];
        }
 
        int even2 = 0, odd2 = 0;
        
        for (int i = 0; i < s2.length; i++) {
            if (i % 2 == 0)
                even2 += s2[i];
            else
                odd2 += s2[i];
        }
        System.out.println("Even1 index positions sum: " + even1);
        System.out.println("Odd1 index positions sum: " + odd1);
        System.out.println("Even2 index positions sum: " + even2);
        System.out.println("Odd2 index positions sum: " + odd2);
        
        int sum1= even1 + even2 ;
    	System.out.println("The sum1 is: " + sum1);
    	
    	 
        int sum2= odd1 + odd2 ;
    	System.out.println("The sum2 is: " + sum2);
    }
	}
