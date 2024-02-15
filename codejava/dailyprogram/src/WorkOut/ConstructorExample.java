package WorkOut;

public class ConstructorExample {

	  static String modelname;
	  static int modelyear;
	  
	  ConstructorExample(String modelname,int modelyear) {
		  
		  this.modelname = modelname;
		  this.modelyear = modelyear;
			  
	  }
	  
	public static String getModelname() {
		return modelname;
	}

	public static int getModelyear() {
		return modelyear;
	}

	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample ("tata", 2019);
//		System.out.println(obj.modelname + obj.modelyear);
		System.out.println(ConstructorExample.getModelname());
		System.out.println(ConstructorExample.getModelyear());
		
	}

	
}
