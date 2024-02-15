//Program 16: SwapTheArray
package com.company;
import java.util.Scanner;

public class SwapTheArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for s1: ");
        int s1 = scanner.nextInt();

        System.out.print("Enter the value for s2: ");
        int s2 = scanner.nextInt();

        System.out.println("Before swap, s1 = " + s1);
        System.out.println("Before swap, s2 = " + s2);

        
        int temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("After swap, s1 = " + s1);
        System.out.println("After swap, s2 = " + s2);
    }
}
