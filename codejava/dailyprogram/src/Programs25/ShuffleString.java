//Program 47: ShuffleString
package Programs25;
//1528
public class ShuffleString {

	public static void main(String[] args) {
		
		String s1 = "codeleet";
		int num[]= {4,5,6,7,0,2,1,3};
		
		char temp[] = new char[num.length];
        
		for (int i = 0; i < num.length; i++) {
			
			temp[num[i]] = s1.charAt(i);
			System.out.println(temp);
			
		}
		
//		System.out.println(temp);
	}

}
