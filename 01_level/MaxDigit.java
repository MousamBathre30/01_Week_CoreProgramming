

import java.lang.Math;
import java.util.Scanner;


public class MaxDigit{

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
	
     if(oldest == amarAge){
		 System.out.println("Oldest is Amar and the age is " + oldest );
	 }else if(oldest == akbarAge){
		  System.out.println("Oldest is akbar and the age is " + oldest );
	 }else{
		  System.out.println("Oldest is Anthony and the age is " + oldest );
	 }
	 
	 if(tallest == amarheight){
		  System.out.println("tallest is Amar and the age is " + tallest );
	 } else if(tallest == akbarheight){
		   System.out.println("tallest is akbar and the age is " + tallest );
	 }else{
		  System.out.println("tallest is anthonay and the age is " + tallest	 };
   	 
	scanner.close();
 }
}