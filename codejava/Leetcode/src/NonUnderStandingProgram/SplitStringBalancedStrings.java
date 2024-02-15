//20
package NonUnderStandingProgram;

public class SplitStringBalancedStrings {

	public static void main(String[] args) {

		String s = "RRRRRRRRRRRLLLLLLLLLLLLLLL";
		char ch[] = s.toCharArray();
		int ans =0;
		int sum =0;

		for (int i = 1; i < ch.length; i++) {

			if(ch[i]=='L'){
				sum++;
			}
			
			else{
				sum--;
			}
			
			if(sum==0){
				ans++;
			}

		}
		
		System.out.println(ans);

	}

}

