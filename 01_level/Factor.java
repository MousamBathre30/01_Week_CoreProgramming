

import java.util.Scanner;


public class Factor{

 public static void main(String args[]){
    
	// taking the input of user age 
	
	Scanner scanner = new Scanner(System.in);
	
	
	 // enter the number 
	 System.out.println("Enter the  number ");
	 
	 int n = scanner.nextInt();

	
	// creating  array to storing factors
	int factors [] = new int[n];
	
	int index=0;
	
// check the even odd condition and storing it into the array's	
	
	for(int i=1; i<n; i++){ 
	  if(n%i==0){
		factors[index] = i;
		 index++;
	  } 
	}

    for(int i=0; i<index; i++){
		System.out.println(factors[i]);
	}	
	
	
	 
	scanner.close();
 }
}