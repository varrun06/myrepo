package WorkOut;

public class StaticVariableExample {
   
   public static int instanceCount = 0;

      StaticVariableExample(){
    	//int instanceCount = 0;
    	instanceCount++;
    } 
    
     

    public static void main(String[] args) {
        
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        
       // System.out.println("Instance number for obj1: " + obj1.getInstanceNumber());
       // System.out.println("Instance number for obj2: " + obj2.getInstanceNumber());
    //    System.out.println("Instance number for obj3: " + obj3.getInstanceNumber());

        System.out.println("Total number of instances created: " + obj1.instanceCount );
        System.out.println("Total number of instances created: " + obj2.instanceCount );
        System.out.println("Total number of instances created: " + obj3.instanceCount );
        //System.out.println("Total number of instances created: " + StaticVariableExample.getInstanceCount());
    }
}

