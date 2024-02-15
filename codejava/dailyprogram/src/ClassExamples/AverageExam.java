package ClassExamples;

import java.util.ArrayList;

import demo.Student;

    class Student {

	private String name;
	private int phy;
	private int che;
	private int maths;
	private boolean catapplied;
	private float average;
	private boolean mastereligibility;

	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public boolean isCatapplied() {
		return catapplied;
	}
	public void setCatapplied(boolean catapplied) {
		this.catapplied = catapplied;
	}

	public boolean isMastereligibility() {
		return mastereligibility;
	}
	public void setMastereligibility(boolean mastereligibility) {
		this.mastereligibility = mastereligibility;
	}


}


public class AverageExam{

	float computeAverageMarks(Student[] obj) {
		float avg=0.0f;
		for (int i =0;i<obj.length;i++ ) {
			avg = (obj[i].getPhy()+ obj[i].getChe() + obj[i].getMaths())/3;
			obj[i].setAverage(avg);
		}
		return avg;
	}


	boolean check(Student[] obj) {

		for (int i =0;i<obj.length;i++ ) {
			if(obj[i].getAverage() > 80 && obj[i].isCatapplied()) {
				obj[i].setMastereligibility(true);

			}
			else {
				obj[i].setMastereligibility(false);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		
		
		Student s1 = new Student();
		AverageExam a1 = new AverageExam();
		s1.setName("gopal");
		s1.setPhy(67);
		s1.setChe(99);
		s1.setMaths(87);
		s1.setCatapplied(true);
		//computeAverageMarks(s1);
//		s1.setAverage();
//		s1.setMastereligibility();

		Student s2 = new Student();
		s2.setName("vijay");
		s2.setPhy(87);
		s2.setChe(98);
		s2.setMaths(56);
		s2.setCatapplied(false);
//		s2.setAverage();
//		s2.setMastereligibility();

		Student s3 = new Student();
		s3.setName("john");
		s3.setPhy(65);
		s3.setChe(67);
		s3.setMaths(90);
		s3.setCatapplied(true);
//		s3.setAverage();
//		s3.setMastereligibility();

		Student s4 = new Student();
		s4.setName("lisa");
		s4.setPhy(89);
		s4.setChe(89);
		s4.setMaths(76);
		s4.setCatapplied(true);
//		s4.setAverage();
//		s4.setMastereligibility();

		Student s5 = new Student();
		s5.setName("smith");
		s5.setPhy(59);
		s5.setChe(77);
		s5.setMaths(88);
		s5.setCatapplied(false);
//		s5.setAverage();
//		s5.setMastereligibility();
	
		Student[] obj = {s1,s2,s3,s4,s5};
		AverageExam a2 = new AverageExam();
		a2.check(obj);
		
		for (int i=0;i<obj.length;i++) {
			
		y	System.out.println(obj[i]);
		/}
		//System.out.println(s5.getPhy());
	}

}
