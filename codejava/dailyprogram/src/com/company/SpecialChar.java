//Program 14: to remove special characters and numbers

package com.company;

public class SpecialChar {

    public static void main(String[] args) {

        String str = "var&$970";

        char[] s1 = str.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            char currentChar = s1[i];

            
            if (!("@!#$%&*".contains(String.valueOf(currentChar)) || Character.isDigit(currentChar))) {
                System.out.print(currentChar);
            }
        }
    }
}
