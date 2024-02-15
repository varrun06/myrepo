//Program 23: Replace Multiple Chars
package dailyprogram;

public class ReplaceMultipleChars2 {
    public static void main(String[] args) {
        String s1 = "chennai";
        char c = 'a';
        char h = 'm';
        char e = '1';
        char n = '2';
        char a = '3';
        char i = 'q';

        
        char[] original = s1.toCharArray();

        char[] modified = new char[original.length];
        
        for (int index = 0; index < original.length; index++) {
            char currentChar = original[index];
            
            if (currentChar == 'c') {
                modified[index] = c;
            } else if (currentChar == 'h') {
                modified[index] = h;
            } else if (currentChar == 'e') {
                modified[index] = e;
            } else if (currentChar == 'n') {
                modified[index] = n;
            } else if (currentChar == 'a') {
                modified[index] = a;
            } else if (currentChar == 'i') {
                modified[index] = i;
            } else {
              
                modified[index] = currentChar;
            }
        }

        
        String s2 = new String(modified);

      
        System.out.println("Original String: " + s1);
        System.out.println("Modified String: " + s2);
    }
}
