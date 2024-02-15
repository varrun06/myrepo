//24
package NonUnderStandingProgram;

public class TwoStringArraysEquivalent1662 {
    public static void main(String[] args) {
        
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String word : word1) {
            s1.append(word);
        }

        for (String word : word2) {
            s2.append(word);
        }

        System.out.println(s1.toString().equals(s2.toString()));
    }
}
