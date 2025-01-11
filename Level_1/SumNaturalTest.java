import java.util.Scanner;


public class SumNaturalTest{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   // create variable for storing total value 
	   double total = 0.0;
	   
	   // variable fot check user input.
	   double valueEnterbyuser;
	   
	   System.out.println("enter the value by the user");
	   valueEnterbyuser = scanner.nextDouble();
	   
	   
	   // infinite loop 
	   while(1){
		   total += valueEnterbyuser;
		   valueEnterbyuser = scanner.nextDouble();
		   if(valueEnterbyuser == 0){
			   break;
		   }
		   if(valueEnterbyuser < 0){
			   break;
		   }
	   }
	   // printing the total value
	   System.out.println("the total value "+ total);
	   
	   scanner.close();
	}
}
