package ClassExamples;

import java.util.ArrayList;

public class AverageExam2 {

	public static void main(String[] args) {

		Object[] gopal = {"gopal", 67, 99, 87, "yes"};
		Object[] vijay = {"vijay", 87, 98, 56, "no"};
		Object[] john = {"john", 65, 67, 90, "yes"};
		Object[] lisa = {"lisa", 89, 89, 76, "yes"};
		Object[] smith = {"smith", 59, 77, 88, "no"};

		ArrayList<Object[]> allstudents = new ArrayList<>();
		allstudents.add(gopal);
		allstudents.add(vijay);
		allstudents.add(john);
		allstudents.add(lisa);
		allstudents.add(smith);

		ArrayList<Object[]> sortedstudents = new ArrayList<>();

		for (int i = 0; i < allstudents.size(); i++) {
			Object[] student = allstudents.get(i);

			for (int j = 0; j < student.length; j++) {

				if ("yes".equals(student[j])) {
					sortedstudents.add(student);
				}
			}
		}

		for (int i = 0; i < sortedstudents.size(); i++) {
			Object[] student = sortedstudents.get(i);
			int sum = 0;

			for (int j = 0; j < student.length; j++) {
				if (student[j] instanceof Integer) {
					sum = sum +(int) student[j];
				}
			}

			double average = (double) sum / (student.length - 2);

			if (average >80) {
				System.out.println(student[0] + " eligible for masters: " + average);
			}
		}
	}
}
