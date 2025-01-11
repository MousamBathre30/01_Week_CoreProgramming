import java.util.Scanner;


public class NaturalNumberSum{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   int number1 = scanner.nextInt();
	   
	   // check if number1 is greater then 0 then it is natural number.
	   
	   if(number1 > 0 ){
		   int sum = number1 * (number1+1)/2;
		   System.out.println("the sum of " + number1
		    + "natural numbers is " + sum 
		   )
	   } else{
		   System.out.println("the numner " + number1
		   + "is not a natural number ");
	   }
	   
	   scanner.close();
	}
}


