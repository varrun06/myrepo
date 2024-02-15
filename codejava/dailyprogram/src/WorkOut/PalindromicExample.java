package WorkOut;

public class PalindromicExample {

    public static boolean isPalindrome(String str) {
        char[] s = str.toCharArray();
        int first = 0;
        int last = s.length - 1;

        while (first < last) {
            if (s[first++] != s[last--]) {
                return false;
            }
        }

        return true;
    }
    public static int  Palindrome(String str) {
        char[] s = str.toCharArray();
        int first = 0;
        int last = s.length - 1;
        int pal=0;
        while (first < last) {
            if (s[first++] != s[last--]) {
                pal++;
            }
        }
        if(pal>last) {
        	return s.length;
        }else {
        	return -1;
        }
         
    }
    public static void main(String[] args) {
        String str1 = "radar";
         for(int i=0;i<str1.length();i++) {
        	 
         }
        if (isPalindrome(str1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
