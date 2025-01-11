import java.util.Scanner;


public class Factorial2{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   
	   // entering the number by the user 
	   int n = scanner.nextInt();   
	   // variable for storing fact #
	   
	   int fact=1;
	   	   
	   // for loop for calculating the factorial  of  number  
	   for(int i=1; i<=n; i++){
		   fact *= i;   
	   }
	   
	   
	     
	   scanner.close();
	}
}
