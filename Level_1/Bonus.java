import java.util.Scanner;


public class Bonus{
	
	public static void main(String args[]){
	   // taking input of different number 
	   
	   Scanner scanner = new Scanner(system.in);
	   
	   // entering the number by the user 
	   int n = scanner.nextInt();   
	   // check given number is natural or not 
	   
	   if(n>=0){
	   // for loop for checking the even and odd form 1 to n using if.   
	    for(int i=0; i<=n; i++){
			if(i%2==0){
				System.out.println("Even" + i);
			}else{
				System.out.println("odd" + i);
			}
		}
	   
	    }
	   scanner.close();
	}
}
