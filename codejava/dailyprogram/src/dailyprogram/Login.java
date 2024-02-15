//Program 19: using getter method 
package dailyprogram;
	
	public class Login { 
	    private String username;
	    private String password;

	    public Login(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	    
	    public static void main(String[] args) {
	        Login myObj = new Login("varrun", "var123");
	        Login myObj2 = new Login("vikram", "vikr123");
	        System.out.println(myObj.getUsername());
	        System.out.println(myObj.getPassword()); 
	        System.out.println(myObj2.getUsername());
	        System.out.println(myObj2.getPassword()); 
	}
	}

	  
		
	    
	
	