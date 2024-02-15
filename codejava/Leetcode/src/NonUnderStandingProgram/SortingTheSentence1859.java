//19
package NonUnderStandingProgram;

public class SortingTheSentence1859 {

	public static void main(String[] args) {
		
		String s = "is2 sentence4 This1 a3 by6 Varrun7 written5";
		
		String []res=new String[s.length()];
		int resarr[] = new int[30];
		int i =0;
        for(String s1:s.split(" ")){
        	char p = s1.charAt(s1.length()-1);
        	
        	int num = p-'0';
        	resarr[i]=num;
        	res[i]=s1.substring(0,(s1.length()-1));
        	
         	//System.out.println(res[i]);
         	i++;
        	//System.out.println("number2 ="+(num+2));
        	//System.out.println("number =" + num);
        	
        }
        
        for(int j=0; j<i-1;j++) {
        	
        	  for(int k=0; k<i-j-1;k++) {
        		  
        		  if(resarr[k]>resarr[k+1]) {
        			  //String[] tStr = new String[20];
        			  int t=resarr[k];
        			  resarr[k]=resarr[k+1];
              	      resarr[k+1]=t;
              	 
              	    String tStr=res[k];
              	    res[k] = res[k+1];              	   
              	    res[k+1]=tStr;
        		  }
        	  }
        	    
        }
        for(int n=0;n<i;n++) {
        	//System.out.print(resarr[n]);
        	System.out.print (" "+res[n]);
        	
        }
	}

}
