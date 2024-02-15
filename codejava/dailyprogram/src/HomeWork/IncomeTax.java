//Program 36: IncomeTax
package HomeWork;

public class IncomeTax {
    public void taxCalculate(char gender, float salary, String city) {
        float tempSalary = 0;
        int standardDeduction = 10000;
        int femaleSpecialDeduction = 50000;
        int maleSpecialDeduction = 25000;
		
		if (gender == 'M') {
                if (salary <= 35000) {
                    System.out.println("Tax is not applicable for male.");
                    return;
				}
		}
		
		if (gender == 'F') {
                if (salary <= 60000) {
                    System.out.println("Tax is not applicable for female.");
                    return;
				}
		}
				
					
        if (city.equals("chennai")) {
            if (gender == 'M') {
                tempSalary = (salary - (standardDeduction + maleSpecialDeduction));
                tempSalary = tempSalary * 0.7f;
                System.out.println(tempSalary);
            } else {
                tempSalary = (salary - (standardDeduction + femaleSpecialDeduction));
                tempSalary = tempSalary * 0.8f;
                System.out.println(tempSalary);
            }
        } else {
            if (gender == 'M') {
                tempSalary = (salary - (standardDeduction + maleSpecialDeduction));
                tempSalary = tempSalary * 0.75f;
                System.out.println(tempSalary);
            } else {
                tempSalary = (salary - (standardDeduction + femaleSpecialDeduction));
                tempSalary = tempSalary * 0.75f;
                System.out.println(tempSalary);
            }
		}
    }

    public static void main(String[] args) {
        IncomeTax varrun = new IncomeTax();
        varrun.taxCalculate('M', 35000.00f, "chennai");
		varrun.taxCalculate('F', 60000.00f, "chennai");
		varrun.taxCalculate('M', 200000.00f, "neyveli");
		varrun.taxCalculate('F', 200000.00f, "neyveli");
    }
}

