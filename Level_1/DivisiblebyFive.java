import java.util.Scanner;


public class DivisiblebyFive{
	
	public static void main(String args[]){
	   // taking input 
	   Scanner scanner = new Scanner(system.in);
	   int number = scanner.nextInt();
	   
	   // check if a number is divisible by 5 or not
	   
	   if(number % 5 == 0 ){
		   System.out.println("Yes Given Number is divisible by 5 !");
		   
	   } else{
		   System.out.println("NO ! Given Number is not divisible by 5");
	   }
	   
	   scanner.close();
	}
}


