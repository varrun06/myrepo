package task2;

public class MostCommonWord819 {

	public static void main(String[] args) {

		String s1 = "Bob hit a ball, the hit BALL flew far after it was hit.";

		String s2 = s1.toLowerCase();

		String ban = "hit";

		String[] words = s2.split("[\\s.,]+");

		int ans [] = new int[words.length];


		for (int i=0; i<words.length;i++) {

			int count=0;
			for (int j=i+1; j<words.length;j++) {

				if(words[i].equals(words[j])) {

					count++;
				}

			}

			ans [i]=count;
			if((ans[i]==1 )&& (words[i].equals(ban))) {
                words[i]=null;
			}
			else if (ans[i]==1) {
				System.out.println(words[i]);
			}		
			
			
		}

		int max=0;
		

		for(int i=0; i<ans.length; i++)
		{
			if(max < ans[i])
			{
				max = ans[i];
			}
		}
		System.out.print(max); 
	}

}
