//16
package LeetCode25;


public class NumSeniorCitizens2678 {

	public static void main(String[] args) {

		String[] s1  = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		int agelimt = 60;
		int count=0;
       
		for(int i=0;i<s1.length;i++) {
			
			int startIndex = 11;
			int endIndex = 13;
			String age = s1[i].substring(startIndex, endIndex);
			
			int agenum=Integer.parseInt(age );  

			//System.out.println("age " + agenum);

			if( agenum >= agelimt) {

				count++;
			}
		}
		
		System.out.println("More than 60 years old : " + count);
	}

}
