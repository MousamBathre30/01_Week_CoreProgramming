
import java.util.Scanner;






public class ConvertCharArray{

   public static String isStringMathch(String str1){
	  
	  
	  // create the char array ---
	  
	  char [] charArray = new char[str1.length()];
	  
	   for(int i=0; i<str1.length(); i++){		
	   
		    charArray[i] = str1.charAt(i);
		
		}
	
	    
		char [] charArraybymethod = str1.toCharArray();
		System.out.println("Array elememt is " + charArraybymethod );
		
		for(int i=0; i<str1.length(); i++){
			System.out.println( "Array element is " + charArray[i] + " ");
			
		}
		
		 return str1;
	   }
	      
  
 public static void main(String args[]){
    
	
	Scanner scanner = new Scanner(System.in);
	
    // enter the strings 

    System.out.println("Enter the string !");
    String str1 = scanner.nextLine().trim();
    System.out.println("String is  " + str1);
 	// trim for better understanding 
	// method to convert string to char array
	String res1 = isStringMathch(str1);
	
 }
   
}