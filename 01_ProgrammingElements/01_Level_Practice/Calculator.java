import java.util.Scanner;

public class Calculator{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    
    // perform all the operation of calculator 

    System.out.println("Addition Opearation (A+B) " + a+b );
    System.out.println("Subtraction Opearation (A-B) " + (a-b) );
    System.out.println("Multiplication Opearation (A*B) " + a*b );
    System.out.println("Division Opearation (A/B) " + a/b );
    
  }  
} 
