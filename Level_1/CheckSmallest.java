import java.util.Scanner;


public class CheckSmallest{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   int number1 = scanner.nextInt();
	   int number2 = scanner.nextInt();
	   int number3 = scanner.nextInt();
	   
	   // check if a first number is smallest of the 3 numbers.
	   
	   if(number1 < number2 ){ 
	       if(number2 < number3){
			 System.out.println("Yes Given Number is smallest among all !");
		   } else{		
     		   System.out.println("NO ! Given Number is not smallest among all");
		   }
		   
	   } else{
		   System.out.println("NO ! Given Number is not smallest among all");
	   }
	   
	   scanner.close();
	}
}


