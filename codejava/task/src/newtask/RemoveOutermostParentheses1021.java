package newtask;

import java.util.Arrays;
import java.util.Stack;

public class RemoveOutermostParentheses1021 {

    public static void main(String[] args) {

        String s = "(())";
        char[] arr = s.toCharArray();

        Stack<Character> obj = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] == '(')&&(arr[i+1] == ')')) {
                obj.push(arr[i]);
                obj.push(arr[i+1]);
                
                
            }
        } 
       
        System.out.println(obj);
    }
}
