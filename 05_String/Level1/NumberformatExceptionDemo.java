import java.lang.Integer;

import java.util.Scanner;
public class NumberformatExceptionDemo {


   public static void handle(String var){
	   
	   try {
		   int result = Integer.parseInt(var);
		   System.out.println(result);
	   } catch(NumberFormatException e){
		   
		   System.out.println("Number format is not right" + e.getMessage());
	   } catch(Exception e){
		   System.out.println("Generic exception" + e.getMessage());
	   }
	   
   }
     
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	  
	  String var = sc.nextLine();

	  handle(var);
	  
	  
	  
   }


}