
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class SumnaturalRecursive{
 
  // calculate using funcation.
  
  public static int calulateSum(int n){
	  
	  int sum=0;
	  sum += n + calulateSum(n-1);
	 
	 return sum; 
  }
  
  public static int CalculateFor(int n){
	  
	  return n*(n+1)/2;
  }
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 FactorProgram fact = new FactorProgram();
	 // enter the number. 
	 System.out.println("enter the number ");
	 
	 int number = scanner.nextInt();
	 
	 int sumrecursive = calulateSum(number);
	  
	  int sumfor = CalculateFor(number);
	  
	  if(sumrecursive == sumfor){
		  
		  System.out.println("Yes");
		  
	  }else{
		  System.out.println("No");
	  }
   
  }  
      
   
}