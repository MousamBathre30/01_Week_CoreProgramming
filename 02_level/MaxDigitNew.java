

import java.util.*;


public class MaxDigitNew{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  number");
       
	 int number = scanner.nextInt();
	
	int index=0;
	int maxdigit=10;
	int tempnumber = number;
	  

	// create the singleDimension array.
	int digit [] = new int[maxdigit];
    
	// count the digit 
	
	for(int i=0; i<maxdigit; i++){ 
	    
		digit[index] = number % 10;
		//digit[index] = single;
		number /=10;
		index ++;
		if(index == maxdigit){
			maxdigit *= 2;
           break;			
		}
	}
	
	// new temp array 
	
	int temp [] = new int [maxdigit];
	
	for(int i=0; i<maxdigit; i++){ 
	    
		temp[index] = number % 10;
		//digit[index] = single;
		number /=10;
		index ++;
		if(index == maxdigit){
			maxdigit *= 2;
			index=0;
           break;			
		}
	}
	
	for(int i=0; i<count; i++){
	  // print the all digit present in the array.	
	  System.out.println(digit[i] + " ");
	}
	 
	 int largest;
	 int secondlarget;
	 
	 if(maxdigit > 10){
	Arrays.sort(digit);
	  largest = temp[index];
	  secondlarget = temp[index-1];
	 System.out.println("Second largest " + secondlarget+ "Largest element" + largest);
	 }else{
		   largest = digit[index];
	  secondlarget = digit[index-1];
	 System.out.println("Second largest " + secondlarget+ "Largest element" + largest);
	 }

	scanner.close();
 }
}