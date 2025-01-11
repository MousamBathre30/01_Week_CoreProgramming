

import java.util.Scanner;


public class MeanofPlayer{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the age number 11 ");
	 
	
	
	int multiplication [] = new int[11];
	int n=11;
	// taking input for the height 
	
	for(int i=0; i<n; i++){
		multiplication[i] = scanner.nextInt();
	}
	
	// storing the value in the array 
	int sum = 0;
	for(int i=1; i<=10; i++){
	  sum += multiplication[i];
	}
	
  // printing the value that is store in the array

    int mean = sum/n;
	
	System.out.println("The mean height of fotball team"+ mean);
	 
	scanner.close();
 }
}