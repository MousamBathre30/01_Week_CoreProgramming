
import java.util.Scanner;






public class FindSubstring{

   public static String isStringMathch(String str1){
	  
	   for(int i=0; i<str1.length(); i++){
		    String substr = "";
		    for(int j=0; j<=i; j++){
				
				substr += str1.charAt(j);
			}
			System.out.println("The substring is "+substr);
			String demo = str1.substring(0,i+1);
			
			if(demo.equals(substr)){
				System.out.println("true");
				System.out.println("the given substring by method "+demo);
			}else{
				System.out.println("False");
				System.out.println(demo);
			}
	   }
	   
	   
	   return str1;
	  
   }
   
   public static String isStringMathchBymethod(String str1 , int index){
	   
	   String result = str1.substring(0,index);
	   return result;
   }
   
    // for comparing the string  
   public static boolean ismathch(String str1 , String str2){
	   
	  return str1.equals(str2);
   }
   
  
 public static void main(String args[]){
    
	
	Scanner scanner = new Scanner(System.in);
	
    // enter the strings 

    System.out.println("Enter the string !");
    String str1 = scanner.nextLine();
    System.out.println("First String is  " + str1);
 	// trim for better understanding 
	int length = str1.length();
	int index  = 0;
	// method to check the two string is equal or not.
   
	
	String res1 = isStringMathch(str1);
	
 }
   
}