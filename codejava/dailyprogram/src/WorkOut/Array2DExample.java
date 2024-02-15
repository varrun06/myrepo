package WorkOut;

public class Array2DExample {

	public static void main(String[] args) {
		
		int s1[][] = {{1,2,3},{3,2,1}};
		
		System.out.println("program manual");
		System.out.print(" "+s1[0][0]);
		System.out.print(" "+s1[0][1]);
		System.out.print(" "+s1[0][2]);
		System.out.println();
		System.out.print(" "+s1[1][0]);
		System.out.print(" "+s1[1][1]);
		System.out.print(" "+s1[1][2]);
		System.out.println(); 
		System.out.println("program with for loop");
		for (int i=0;i < s1.length;i++) {
			System.out.println();
			for (int j=0;j < s1[i].length;j++) {
				
				System.out.print(" "+s1[i][j]);
				
			}
			
		}

	}

}
