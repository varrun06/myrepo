//Program 28: Average mark of student
package HomeWork;

public class AverageMarks {
	public static void main(String[] args) {
		int[] maths = {98, 63, 70, 80};
		int[] phy = {85, 71, 82, 90};
		int[] che = {79, 82, 91, 87};
		int[] eng = {90, 89, 68, 90};
		int numStudents = maths.length;
		float totalAverage = 0.0f;

		for (int i = 0; i < numStudents; i++) {

			int totalMarks = maths[i] + phy[i] + che[i] + eng[i];

			float studentAverage = (float) totalMarks / 4;

			totalAverage += studentAverage;

			System.out.println("Student " + (i + 1) + " Average: " + studentAverage);

			if (studentAverage > 90) {
				System.out.println("Student " + (i + 1) + " Distinction");
			} 
			else if (studentAverage >= 60 && studentAverage <= 90) {
				System.out.println("Student " + (i + 1) + " Good");
			} 
			else {
				System.out.println("Student " + (i + 1) + " Average");
			}
		}

		float collegeAverage = totalAverage / numStudents;
		System.out.println("Overall Average of three students: " + collegeAverage);

		if (collegeAverage > 90) {
			System.out.println("College is excellent" );
		} 

		else if (collegeAverage >= 60 && collegeAverage <= 90) {
			System.out.println("College is satisfactory");
		}

		else {
			System.out.println("College needs improvement");
		}


	}
}

