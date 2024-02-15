//Program 52: CharCount
package leetprogram;

public class CharCount {
    public static void main(String[] args) {
        String[] str = {"CHAI", "CHCH", "CHCHHCH", "CHENNAI", "PMPM", "PONDY"};
        char[] ch = {'C', 'H'};

        int count = 0;
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            char[] charArray = s.toCharArray();
            int charCount = 0;

            for (int j = 0; j < s.length(); j++) {
                // Compare with both characters 'C' and 'H'
                if (charArray[j] == ch[0] || charArray[j] == ch[1]) {
                    charCount++;
                }
            }

            // Check if both characters are present in the string
            if (charCount == ch.length) {
                count++;
            }
        }

        System.out.println("count CHAI and CHENNAI  =" + count);
    }
}
