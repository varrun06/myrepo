//Program 10: how many employees met the target
package com.company;

public class EmployeeWorkingHours {

	public static int EmployeesTarget(int[] hours,int limit,int employeehours) {

		int count=0;

		

		for (int i=0; i < limit;i++) {

			if (hours[i] >= employeehours ) {

				count++;
			}

		}
		return count;
	}

//		System.out.println("employee reach hours " + count);
		
		public static void main(String[] args) {

			int[] hours = {0, 1, 2, 3, 4,4,3,3,2,6,3,3};
			int limit = 10 ;
			int employeehours = 6;
			
			int result = EmployeesTarget(hours,limit,employeehours);
			
			System.out.println("employee reach target = " + result);
	}

}
