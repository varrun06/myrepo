//Program 2: Addition of 2 numbers using function
package com.company;

public class AddFunction {

    public static String add(int a, int b) {
        String c = "a" + "b";
         
        return(c);
    }

   public static void main(String[] args) {
        AddFunction obj = new AddFunction(); 
        String ans = obj.add(28, 49);
//        int ans1 = obj.add(6, 9);
        System.out.println(ans);
//        System.out.println(ans1);
    }
}