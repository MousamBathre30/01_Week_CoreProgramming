
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class DistributeChoclate{
 
   // calculate the number 
   public static int [] findRemainderAndQuotient(int chocolates , int student){
      
	    int [] array   = new int[2];
	   int remder =0;
	   int  quotient =0;
	   
	   remder = chocolates % student;
	   array [0] = remder;
	   quotient = chocolates / student;
	   array [1] = quotient;
	   
	   return array;
   }
   
 
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 // enter the number. 
	 System.out.println("enter the number of student and number of chocolates");
	 int student = scanner.nextInt();
	 int chocolates = scanner.nextInt();
	 
	 
	 int [] array = findRemainderAndQuotient(chocolates , student);
	 
    
	  
	  System.out.println("Remending chocolates is " + array[0] + "after distributing among " + array[1] + "children");
   
  }  
      
   
}