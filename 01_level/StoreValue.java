

import java.util.Scanner;


public class StoreValue{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the number ");
	 int n = scanner.nextInt(); 
	
	int store [] = new int[10];
	
	// storing the value in the array 
	int total = 0;
	while(true){
		total += n;
		if(n<=0){
			System.out.println("Total value that is enter by the user is " + total);
			break;
		}
		// again entering the number by user.
		n = scanner.nextInt();
	}
	
	
	scanner.close();
 }
}