
import java.util.Scanner;

public class HandShake{
 
   public static int calculation(int n){
     int formula = (n*(n-1))/2;
     return formula;
   }
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 // enter the numeber of student by the user
	 System.out.println("Enter the Number of student");
	 int student = scanner.nextInt();
	 // call the method in the System.out.println Subroutine 
	int calculatehand = calculation(student);
	
 	System.out.println("Maximum number of hand saked " + calculatehand);
	 
  
  }  
      
   
}