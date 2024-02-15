package WorkOut;

public class CompareTwoString {

	public static void main(String[] args) {
		
		char [] arr = {'w','i','n','n','e','r'};
		
		char [] arr2 = new char[6];
		        
		        arr2[0] = 'r';
		        arr2[1] = 'u';
		        arr2[2] = 'n';
		        arr2[3] = 'n';
		        arr2[4] = 'e';
		        arr2[5] = 'r';
		
		String str1 = new String(arr);
		
		String str4 = new String(arr2);
		
		String str2 = "winner";
		String str3 = "runner";
		
		if (str1.equals(str2)) {
		    System.out.println("Strings are equal");
		}
		
		 if (str1.equals(str4)) {
		    System.out.println("Strings are not equal");
		}
		 
		 if (str1.equals(str3)) {
			    System.out.println("Strings are not equal");
			}
		

	}

}
