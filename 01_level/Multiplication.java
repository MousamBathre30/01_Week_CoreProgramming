

import java.util.Scanner;


public class Multiplication{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the number ");
	 int n = scanner.nextInt(); 
	
	int multiplication [] = new int[10];
	
	// storing the value in the array 
	
	for(int i=1; i<=10; i++){
		int value = i * n;
	   multiplication[i-1] = value;  
	}
	
  // printing the value that is store in the array

    for(int i=0; i<10; i++){
	   System.out.println(n + "*" + "=" + multiplication[i]); 
	}
	
	
	scanner.close();
 }
}