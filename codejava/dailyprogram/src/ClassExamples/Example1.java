package ClassExamples;

public class Example1 {

	public static void main(String[] args) {

		int i1[]= {10,20,-10,40,20};
		int i2[]= {30,40,10,20,25};
		int o[] =  new int [i1.length];

		for (int i=0; i<o.length;i++) {
			if((i1[i]<0)||(i2[i]< 0)) {
				
				i1[i]=0;
				i2[i]=0;
				
			}
		}

		for (int i=0; i<o.length;i++) {

			o[i]= i1[i]*i2[i];
			}
		
		for (int i=0; i<o.length;i++) {

			System.out.println(o[i]);
		}
	}

}
