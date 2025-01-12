
import java.util.Scanner;

public class SimpleInterest{
 
   public static int simpleinterest(int p, int r, int t){
     int simpleinterest = (p*r*t)/100;
     return simpleinterest;
   }
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 // enter the principal by the user
	 System.out.println("Enter the principal");
	 int principal = scanner.nextInt();
	 
	 // enter the rate by the user. 
	 System.out.println("Enter the Rate");
	 int rate = scanner.nextInt();
	 // enter the time by the user.
	 System.out.println("Enter the time");
	 int time = scanner.nextInt();
	 // call the method in the System.out.println Subroutine 
	int simpleinterest = simpleinterest(principal,rate,time);
	
 	System.out.println("The Simple Interest is " + simpleinterest + " For Principal" + principal+ " Rate of interest " + rate + " and time " + time);
	 
  
  }  
      
   
}