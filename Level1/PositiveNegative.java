
import java.util.Scanner;

public class PositiveNegative{
 
   // calculate the number 
   public static int calculation(int n ){
     
	 if(n > 0){
		 return 1;
	 } else if(n < 0){
		 return -1;
	 }
     return 0;
   }
   
 
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 // enter the number 
	 int n = scanner.nextInt();
	 // call the method in the System.out.println Subroutine 
	int value = calculation(n);
	if(value == 0){
		System.out.println(" the number is zero ");
	}else if(value > 0){
		System.out.println(" the number is positive ");
	} else{
		System.out.println(" the number is negative");
	}
 	
	 
  
  }  
      
   
}