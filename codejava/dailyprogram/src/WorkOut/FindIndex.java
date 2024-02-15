package WorkOut;

public class FindIndex {
	
	    public static int Index(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                return i; 
	            }
	        }
			return -1;
		
	    }
	        public static void main(String[] args) {
	    		int[] arr = {10, 20, 30, 40, 50, 60};
	    	    int target = 30;
	    	    
	    	  int result = Index(arr, target);
	    	  
	    	  System.out.println(result);
	}

}