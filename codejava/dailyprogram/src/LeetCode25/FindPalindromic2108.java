//9
package LeetCode25;

public class FindPalindromic2108 {

    public static void main(String[] args) {

        String words[] = {"abc", "car", "ada", "racecar", "cool"};

        int count = 0; 
        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];
            
            StringBuilder obj = new StringBuilder(s1);
            obj.reverse();
            String reversed = obj.toString();

            if (s1.equals(reversed)) {
                System.out.println(s1 + " is a palindrome");
                count++;
            }
        }

        System.out.println("Total number of palindromes: " + count);  // Move this inside the loop
    }
}
