import java.util.Scanner;


public class SumNaturalTest2{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   
	   // entering the number by the user 
	   int n = scanner.nextInt();
	   // create variable for storing total sum of natural 
	   int sumofNatural number = n*(n+1)/2;
	   
	   // variable for storing sum #
	   
	   int total=0;
	   	   
	   // loop for calculating the sim of natural number  
	   while(n--){
		   total += n;
	   }
	   
	   
	   // if total is equal to sumofNatural then print correct.
	 if(total == sumofNatural)
	 {
	 System.out.println("Correct and the sum of natural number is "+
     sumofNatural	 );
	 }	   
	   scanner.close();
	}
}
