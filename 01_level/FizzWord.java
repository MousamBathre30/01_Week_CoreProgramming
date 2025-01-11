

import java.util.Scanner;


public class FizzWord{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  number ");
	 
	 int number = scanner.nextInt();
	
	int index=0;
	// create the singleDimension array.
	String array [] = new String[number];
	
	
 // check the fizz Buzz , and fizzBuzz condition.
	
	System.out.println("Print the Array");
	for(int i=0; i<number; i++){ 
	    
		if(i%3 == 0){
			array[index] = "fizz";
			index++;
		} else if(i%5==0){
			array[index] = "Buzz";
			index++;
		}else if ( i%3==0 && i%5 == 0){
			array[index] = "fizzBuzz";
			index++;
		}else{
			continue;
		}
		
	}
	 
	// nested loop for printing and storing the array
   // print the single dimensitional array .
   for(int i=0; i<index; i++){
	   System.out.println(array[i] + " ");
	}
 
	scanner.close();
 }
}