package demo;

import java.util.ArrayList;

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


public class AverageExam3{

	private ArrayList<Student> studentList;
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(String name, int phy, int chem, int maths, boolean catAppliedFlag) {
		if(getStudentList() == null) {
			setStudentList(new ArrayList<Student>());
		}
		Student sObj = new Student();
		sObj.setName(name);
		sObj.setPhy(phy);
		sObj.setChe(chem);
		sObj.setMaths(maths);
		sObj.setCatapplied(catAppliedFlag);
		studentList.add(sObj);

	}
	
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

		AverageExam3 aExam = new AverageExam3();
		aExam.addStudent("gopal", 67, 99, 87, true);
		aExam.addStudent("vijay", 87, 98, 56, false);
		aExam.addStudent("john", 65, 67, 90, true);
		aExam.addStudent("lisa", 89, 89, 76, true);
		aExam.addStudent("smith", 59, 77, 88, false);

		
		Student[] arr = new Student[aExam.getStudentList().size()];
		
		arr = aExam.getStudentList().toArray(arr);// arraylist convert into array 
		aExam.computeAverageMarks(arr);
		aExam.check(arr);
		
		for(int index=0; index<arr.length; index++) {
			System.out.println("Name is " + arr[index].getName() + " masters eligibility is: "+ arr[index].isMastereligibility());
		}
		
	}

}

