import java.util.Scanner;


public class CheckSpring{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   int Month = scanner.nextInt();
	   int day   = scanner.nextInt();
	   // check if the Month is 3 , 4 , 5 , 6; 
	   // and day is 20 then it is spring other wise not spring 
	   if(Month >= 3 && Month < 6){
		   System.out.println("Its a Spring Season");
	   } else if (Month == 6 && day <= 20){
		   System.out.println("Its a Spring Season");
	   } else {
		   System.out.println("Not a Spring Season");
	   }
	   
	   scanner.close();
	}
}


