//Program 29: Calculator
package HomeWork;


public class Calculator {
	
	public int add (int a,int b) {
		
		   int sum = a+b;
		   
		   return sum ;	   
  }
	   
	   public int sub (int a,int b) {
			
		   int diff = a-b;
		   
		   return diff ;	   
  }
	  
	   
	   public int multi (int a,int b) {
			
		  int product = a*b;
		   
		   return product ;	   
  }
		
	   public float divide (float a,float b) {
			
		    float y = a/b;
//		   float z=a%b;
//		   System.out.println(z);
		   
		   return y ;	   
  }
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator ();
		
		int result = c1.add(5, 9);
	
		System.out.println(result);
	
	Calculator c3 = new Calculator ();
	
	int a = c3.add(5, 9);
	System.out.println("add = "+a);
	
	float b = c3.divide(5, 9);
	System.out.println("divide = "+b);
	
	int c = c3.multi(5, 9);
	System.out.println("mult = "+c);
	
	int d = c3.sub(5, 9);
	System.out.println("sub = "+d);
	
	
	
//	float divideresult = c1.divide(5, 9);
//	System.out.println(divideresult);
//	System.out.println("============");
//	Calculator c2 = new Calculator ();
//	
//	int productresult = c2.multi(5, 9);
//	System.out.println(productresult);
//	
//	int diffresult = c2.sub(5, 9);
//	System.out.println(diffresult);
//	System.out.println("===========");
//	

	
	}

}

