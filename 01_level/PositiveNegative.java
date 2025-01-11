
import java.util.Scanner;


public class PositiveNegative{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	int n=5; // total number of student 
	
	int number [] = new int[n];
	
	// taking input the users age 
	
	System.out.println("Enter the 5 number ");
	for(int i=0; i<n; i++){
	   number[i] = scanner.nextInt();
	}
	
	// checking if the user is 18 above or equal or not 
	
	for(int i=0; i<number.length; i++){
	   if(number[i] > 0){
	     System.out.println("number is positive");
		 if(number[i]%2==0){
			 System.out.println("number is even");
		 }else{
			 System.out.println("number is odd");
		 }
	   } else if(number[i]==0){
		   System.out.println("number is zero");
		   System.out.println("number is even");
	   }else{
	      System.out.println("number is negative");
		  
	   }
	}
	
	// check the first and last element is equal or not 
	
	if(number[0] == number[n-1]){
		System.out.println("Given number is equal");
	} else{
		System.out.println("Given number is not equal");
	}
	
	scanner.close();
 }
}