package NonUnderStandingProgram;

import java.util.Scanner;

class details{
	
	String companyname;
	int salary;
	
	public String getCompanyname() {
		return companyname;
	}
	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
		
	
}

class student extends details {
    String name;
    int rollnum;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




public class Eg1 {

    public static void main(String[] args) {
    	
    	Scanner s1 = new Scanner(System.in);
    	Scanner s2 = new Scanner(System.in);
        
      
        System.out.println("Enter how many student:");
         int s3 = s2.nextInt();
         student[] students = new student[s3];
         details[] d1 = new details[s3];
         
        
        for (int i = 0; i < s3; i++) {
        	
            student obj = new student();
            
            

            System.out.println("Enter student name:");
            obj.setName(s1.nextLine());

            System.out.println("Enter student roll number:");
            obj.setRollnum(s1.nextInt());

            System.out.println("Enter student age:");
            obj.setAge(s1.nextInt());
            
            s1.nextLine();
            
            System.out.println("Enter student company name:");
            obj.setCompanyname(s1.nextLine());

            System.out.println("Enter salary:");
            obj.setSalary(s1.nextInt());
           
            students[i] = obj;
            
            
        }

        
        for (student s : students) {
            System.out.println(s.getName() + " " + s.getRollnum() + " " + s.getAge() +" "+s.getSalary() + " " + s.getCompanyname());
            
        }
        
         
    }
}
