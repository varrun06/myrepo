//Program 30: checkdata
package HomeWork;

public class CheckData {
    public static boolean varrun(int age, float salary, boolean isNRI, char gender) {
        boolean result = true; 

        if (age == 21) {
            System.out.println("Age is: " + age);
        } else {
            result = false; 
        }

        if (salary == 1200.55f) {
            System.out.println("Salary is: " + salary);
        } else {
            result = false; 
        }

        if (isNRI) {
            System.out.println("isNRI is: " + isNRI);
        } else {
            result = false; 
        }

        if (gender == 'M') {
            System.out.println("Gender: Male");
        } else {
            System.out.println("Gender: Female");
        }

        return result; 
    }

    public static void main(String[] args) {
        CheckData cq = new CheckData();
        boolean a = cq.varrun(21, 1200.55f, true, 'M');
        System.out.println(a);
    }
}
