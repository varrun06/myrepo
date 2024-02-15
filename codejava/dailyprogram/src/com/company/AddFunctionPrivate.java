//Program 3: Addition of 2 number using Private class and Function 
package com.company;

 public class AddFunctionPrivate {

	    private static int add(int a, int b) {
	        return a + b;
	    }

	    public int performAddition(int a, int b) {
	         int c = add(a, b);
	         return (c);
	    }
	    
	    public static void main(String[] args) {
	        AddFunctionPrivate obj = new AddFunctionPrivate();
	        
	        int ans = obj.performAddition(28, 49);
	        int ans1 = obj.performAddition(6, 9);

	        System.out.println(ans);
	        System.out.println(ans1);
	    }

	    
	    
	}
