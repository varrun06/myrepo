//Program 4: Addition of 2 numbers with Protected Class and Functions
package com.company;

public class AddFunctionProtected {

    protected static int add(int a, int b) {
        return a + b;
    }
   
    public int performAddition(int a, int b) {
        return add(a, b);
    }
    
    public static void main(String[] args) {
        AddFunctionProtected obj = new AddFunctionProtected();
        
        int ans = obj.performAddition(28, 49);
        int ans1 = obj.performAddition(6, 9);

        System.out.println(ans);
        System.out.println(ans1);
    }

    
    
}
