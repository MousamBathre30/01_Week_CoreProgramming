

import java.util.Scanner;


public class Bonus{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  salary of Zara employess");

	
	int index=0;
	// create the singleDimension array.
	int salary [] = new int[10];
	int age [] = new int [10];
	for(int i=0; i<10; i++){
		salary [i] = scanner.nextInt();
		age [i] = scanner.nextInt();
	}
	
	int temp=0;
	double bonus=0;
	int totalSalary=0;
 // check age for the bonus. 
	
	System.out.println("Print the Array");
	for(int i=0; i<10; i++){ 
	   if(age[i] >= 18){
		   temp = salary[i];
		   bonus = temp * 0.05;
		   totalSalary = salary[i] + (int)bonus;
		   System.out.println("old salary without bonus "+
		   salary[i] + "new salary after bonus " + totalSalary
		   + "Bonus is " + bonus);  
	   } else{
		   System.out.println("Employe number " + (i) + "Nope you dont get the Bonuus..Your  Salary is remain Same " + salary[i]);
	   }
       		
	}
	 
	
 
	scanner.close();
 }
}