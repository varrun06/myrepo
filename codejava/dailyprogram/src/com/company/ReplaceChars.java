//Program 13: letter conversation 

package com.company;

public class ReplaceChars {

	public static void main(String[] args) {
		String s1 = "varru";

		char[] original= {
				'v', 'a', 'r', 'u', 'n'
		};

		char[] changes = {
				'k', 'i', 'n', 'g', '0', '6'
		};


		char[] s2 = s1.toCharArray(); 

		for (int i=0; i < s2.length; i++) {

			char currentChar = s2[i];

			for (int j=0; j < original.length; j++) {

				if (currentChar == original[j]) {

					s2[i] = changes[j];

				}
			}
		}

		String obj = new String(s2);
		
		System.out.println(obj);



	}
7}
