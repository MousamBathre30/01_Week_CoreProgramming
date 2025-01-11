
import java.util.Scanner;


public class VoteEligibal{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	int n=10; // total number of student 
	
	int age [] = new int[n];
	
	// taking input the users age 
	
	System.out.println("Enter the age of 10 users ");
	for(int i=0; i<n; i++){
	   age[i] = scanner.nextInt();
	}
	
	// checking if the user is 18 above or equal or not 
	
	for(int i=0; i<n; i++){
	   if(age[i] >= 18){
	     System.out.println("The student with the age " + age[i] + " can vote");
	   } else{
	      System.out.println("The student with the age "+ age[i] + " Can not vote");
	   }
	}
	
	scanner.close();
 }
}