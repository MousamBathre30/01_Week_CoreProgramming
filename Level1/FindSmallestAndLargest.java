
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
public class FindSmallestAndLargest{
 
   // calculate the number 
   public static int [] findSmallestAndLargest(int n1, int n2,int n3){
     
	   int [] arrays = new int [3];
	   int large =0;
	   arrays[0] = n1;
	   arrays[1] = n2;
	   arrays[2] = n3;
	 
	   return arrays;
   }
   
 
  
  // main method to start the program 
   
  public static void main(String args[]){
     
	 Scanner scanner = new Scanner(System.in);
	 
	 
	 // enter the number. 
	 System.out.println("enter the 3 number");
	 int number1 = scanner.nextInt();
	 int number2 = scanner.nextInt();
	 int number3 = scanner.nextInt();
	 
	 int [] array = findSmallestAndLargest(number1 , number2 , number3);
	 
      Arrays.sort(array);
	  
	  System.out.println("Smallest element is " + array[0] + "Largest element is " + array[2]);
   
  }  
      
   
}