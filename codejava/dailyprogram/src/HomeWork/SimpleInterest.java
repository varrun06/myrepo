//Program 39: SimpleInterest
package HomeWork;

public class SimpleInterest {
    
    public static float calculateAverage(int number1, int number2, int number3, int number4, int number5) {
        int sum = number1 + number2 + number3 + number4 + number5;
        float average = (float) sum / 5;
        return average;
    }

    float calculateSimpleInterest(float principalAmount, float interestRate) {
        float simpleInterest = (principalAmount * interestRate) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        SimpleInterest calculator1 = new SimpleInterest();

        float averageResult = calculateAverage(40, 89, 90, 89, 87);
        System.out.println("Average Result: " + averageResult);

        calculator1 = new SimpleInterest(); 

        float instanceAverageResult = calculator1.calculateAverage(10, 20, 30, 40, 50);
        System.out.println("Instance Average Result: " + instanceAverageResult);

        SimpleInterest calculator2 = new SimpleInterest();

        float interestResult1 = calculator2.calculateSimpleInterest(100000.00f, 12.00f);
        System.out.println("Interest Result 1: " + interestResult1);

        float interestResult2 = calculator2.calculateSimpleInterest(50000.00f, 12.00f);
        System.out.println("Interest Result 2: " + interestResult2);
    }
}
