 
import java.util.Scanner;






public class GenerateException{
          /*
	      public static void generate(){
			  
			 String text = null;
			  text.substring(0,2);

			  }
			*/  
	      public static void handle(){
			  
			  String text = null;
			  
			  try{
				  text.substring(0,2);
			  }catch(NullPointerException e){
				  System.out.println("Null pointer exception => " + e.getMessage());
			  }catch(Exception e){
				  System.out.println("Generic Exception =>" + e.getMessage());
			  }
		  }		  
  
 public static void main(String args[]){
    
	
	Scanner scanner = new Scanner(System.in);
	
    // enter the strings #]
	 
	 // generate exeption
	// isStringMathch();
	 
	  handle();
	
    
 }
   
}