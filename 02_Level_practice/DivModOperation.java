import java.util.Scanner;

public class DivModOperation{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number a and b !");
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();

    // calculate the Quotient and Reminder 
    
    int quotient = numberA / numberB ;
    int remender = numberA % numberB ;
    
    

    System.out.println(" the Quient is  " + quotient + " and Reminder is  " + remender + "of two  number "  + numberA + " and " + numberB );
}
} 
