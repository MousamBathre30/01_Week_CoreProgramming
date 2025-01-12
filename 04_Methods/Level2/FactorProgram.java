
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class FactorProgram{
 
  // calculate using funcation.
  
  
  int count (int array []){
	   int count=0;
	  for(int i=0; i<array.length; i++){
		 
		  if(array[i] != 0){
			  count++; 
			  
		  } else{
			 break;
		  }
	  }
	  return count;
  }
   
  public static int[] calulateFactor(int number){
	
	    int [] arraysofFactor = new int[number];
		int index=0;
	  // find factor
	  for(int i=1; i<number; i++){
		  if(number%i==0){
			  arraysofFactor[index] = i;
			  index++;
			  
		  }
	  }
	  
	
	  // sum 
	  // sum of square 
	  // product of factor
	  // display 
	     
	  return arraysofFactor;
	  
   }

 
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 FactorProgram fact = new FactorProgram();
	 // enter the number. 
	 System.out.println("enter the number ");
	 
	 int number = scanner.nextInt();
	 
	 int factorArray[] = calulateFactor(number);
	  int product=0;
	  int square=0;
	  int sum =0;
	  int index = fact.count(factorArray);
	  
	  
	  
	 for(int i=0; i<index; i++){
		 
		 System.out.println("Element of the factor is " + factorArray[i]);
		 sum+=factorArray[i];
	     square += Math.pow(sum,2);
	     product *= factorArray[i];
	 }
	
    
	  
	  System.out.println("The sum of factor is  " + sum + "square of the factor is " + square + " product of the factor is " + product);
   
  }  
      
   
}