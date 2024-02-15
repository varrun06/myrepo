package HomeWork;

public class CharCount2 {
  public static void main(String[] args) {
      String[] str = {"CHAI", "CHCH", "CHCHHCH", "CHENNAI", "PMPM", "PONDY","CHHCH"};
      char[] ch = {'C', 'H'};

      int count = 0;
      for (int i = 0; i < str.length; i++) {
          String s = str[i];
          char[] charArray = s.toCharArray();
          int charCount = 0;

          for (int j = 0; j < s.length(); j++) {
              // Compare with both characters 'C' and 'H'
              if (charArray[j] == ch[0] && charArray[j+1] == ch[1]) {
                  charCount++;
              }
          }

          // Check if both characters are present in the string
          if (charCount >= ch.length) {
              count++;
          }
      }

      System.out.println("count CHCH  =" + count);
  }
}

