

import java.lang.Math;
import java.util.Scanner;


public class AmberAkbarAnthony{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  age and height of amar, akbar and anthony Respectively");
       
	 int amarAge = scanner.nextInt();
	 int amarheight = scanner.nextInt();
	 int akbarAge = scanner.nextInt();
	 int akbarheight = scanner.nextInt();
	 int anthonyAge = scanner.nextInt();
	 int anthonyheight = scanner.nextInt();
	 
	 int tallest;
	 int oldest;
	 
	 oldest = Math.max(amarAge,Math.max(akbarAge,anthonyAge));
	 tallest = Math.max(amarheight,Math.max(akbarheight,anthonyheight));
	 
	 System.out.println("Smallest element " + oldest + "Largest element " + tallest);
	 
	scanner.close();
 }
}