import java.util.Scanner;


public class SumNumber2{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   // create variable for storing total value 
	   double total = 0.0;
	   
	   // variable fot check user input.
	   double valueEnterbyuser;
	   
	   System.out.println("enter the value by the user");
	   valueEnterbyuser = scanner.nextDouble();
	   
	   
	   // run untill user not give the 0 as input.
	   while(valueEnterbyuser != 0){
		   total += valueEnterbyuser;
		   valueEnterbyuser = scanner.nextDouble();
	   }
	   // printing the total value
	   System.out.println("the total value "+ total);
	   
	   scanner.close();
	}
}
