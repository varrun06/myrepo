//24
package LeetCode25;

public class TwoStringArraysEquivalent1662 {
    public static void main(String[] args) {
        
        String[] word1 = {"ab", "c"};//abc
        String[] word2 = {"a", "bb"};//abc

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }

        System.out.println(s1.toString().equals(s2.toString()));
    }
}
