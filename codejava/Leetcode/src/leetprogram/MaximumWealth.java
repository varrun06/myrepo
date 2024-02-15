//Program 56: Maximum Wealth
package leetprogram;


public class MaximumWealth {
	 public static void main(String[] args) {

		 
		        int[][] accounts ={ {1,2,3},{2,2,1}};
	        
		        
		        
		        int a= 0;
		        for (int i = 0; i < accounts.length; ++i) {
	        		
	            int b= 0;
	            for(int j = 0; j < accounts[i].length; ++j) {
       	        
	        	b = b + accounts[i][j];
	        	     
}
	            
	            System.out.println(b);
	            if (b >= 6) {
		        	  System.out.println("Wealth");
		        	} else {
		        	  System.out.println("not Wealth");
		        	}
		 
	    }
		 
		        
	        }
	 }

