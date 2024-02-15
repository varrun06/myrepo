package WorkOut;

import java.util.Scanner;

public class PalindromicExample2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	String Str1 = input.nextLine();

	char[] s1 = Str1.toCharArray();
    
    int first =0;
    int last = s1.length-1;
    int pal=0;
    while(first<last) {
    	if(s1[first++]==s1[last--]) {
    		 pal++;
    	}
    }
    if(pal>=last) {
    	System.out.println("Palindrome");
    } else {
    	System.out.println("Not Palindrome");
    }
}
}

