//8
package LeetCode25;

public class FaultyKeyboard2810 {

    public static void main(String[] args) {
        String word = "string";
        char[] charArray = word.toCharArray();

        StringBuilder obj = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
           
        	char c = charArray[i];
            
        	if (c == 'i') {
                obj.reverse();
            } 
        	else {
                obj.append(c);
            }
        }

        System.out.println(obj);
    }
}
