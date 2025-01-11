import java.util.Scanner;


public class Multiplication{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   
	   // entering the number by the user define the working year
	   int n = scanner.nextInt();     
	   // check enter number is greater then 5 and less then 10;
	   
	   if(n>5 && n<10){
	   // for loop for checking the even and odd form 1 to n using if.   
         for(int i=1; i<=10; i++){
         System.out.print(n +"*" + i +" = "+ n*i )	;	 
		 }
	    } else{
	     System.out.println("Nope! number is not valid ");	 
		}
		
	   scanner.close();
	}
}
