import java.lang.Integer;

import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {


   public static void handle(int array[] , int val){
	   
	   try {
		   System.out.println(array[val]);
		  
	   } catch(ArrayIndexOutOfBoundsException e){
		   
		   System.out.println("Array index out of bound " + e.getMessage());
	   } catch(Exception e){
		   System.out.println("Generic exception" + e.getMessage());
	   }
	   
   }
     
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	  
	  int arr [] = new int[5];
	  for(int i=0; i<5; i++){
		  arr[i] = sc.nextInt();
	  }
	  
	  
	  System.out.println("enter the value you want to acces from index ");
	  int value = sc.nextInt();
	  
	  
	  handle(arr , value);
	  
	  
	  
   }


}