 
import java.util.Scanner;






public class GenerateException2{
	
	      // method that generate string array out of bount 
          /*
	      public static void generate(){
			  
			   String str1 = "Hello!";
			  System.out.println(str1.charAt(6));
			  }
			*/  
			
			// method to handel run time exception 
			
	      public static void handle(){
			  
			 String str1 = "Hello!";

			  
			  try{
				  System.out.println(str1.charAt(6));
			  }catch(StringIndexOutOfBoundsException e){
				  System.out.println("String index out of bound=> " + e.getMessage());
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