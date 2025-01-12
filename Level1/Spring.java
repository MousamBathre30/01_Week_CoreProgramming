
import java.util.Scanner;

public class Spring{
 
   // calculate the number 
   public static int calculation(int month , int day ){
     
	 if(month >= 3 && month <= 6){
		 if(day <= 20){
			  return 1;
		 } else{
			 return 0;
		 }
		
	 } 
     return 0;
   }
   
 
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 // enter the month and day. 
	 System.out.println("enter the month");
	 int month = scanner.nextInt();
	 
	  System.out.println("enter the day");
	 int day = scanner.nextInt();
	 // call the method in the System.out.println Subroutine 
	int value = calculation(month , day);
	if(value == 0){
		System.out.println(" Nope! thee is no spring  ");
	}
	 else{
		System.out.println(" YEs it is spring!");
	}
 	
	 
  
  }  
      
   
}