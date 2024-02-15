package Examples;
// Static method 
public class MathUtils {
   
    public static int square(int number) {
        return number * number;
    }

    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        
        int squaredNum = MathUtils.square(num1);
        int maximum = MathUtils.max(num1, num2);

        System.out.println("Square of " + num1 + " is " + squaredNum);  
        System.out.println("Maximum of " + num1 + " and " + num2 + " is " + maximum);  
    }
}

