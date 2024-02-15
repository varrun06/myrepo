//Program 20: using getter method
package dailyprogram;
	
	public class Login2 { 
	    private String username;
	    private String password;

	    public Login2() {
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	    
	    public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public void printDetails() {
			System.out.println("Name is :"+this.username);
			System.out.println("Password is :"+this.password);
		}
		
		
		
		public static void main(String[] args) {
	        Login2 myObj = new Login2();
	        Login2 myObj2 = new Login2();
	        myObj.setUsername("John"); 
	        myObj.setPassword("John123"); 
	        myObj2.setUsername("ram"); 
	        myObj2.setPassword("ram123");
//			 
//			  System.out.println(myObj.getUsername());
//			  System.out.println(myObj.getPassword());
//			  System.out.println(myObj2.getUsername());
//			  System.out.println(myObj2.getPassword());
			 
	        myObj.printDetails();
	        myObj2.printDetails();
	        
	        
	        
	}
	}

	  
		
	    
	
	