import java.util.Scanner;

public class IntOperation{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number a , b and c !");
    int numberA = scanner.nextInt();
    int numberB = scanner.nextInt();
    int numberC = scanner.nextInt();

    // calculate the operation
     
    
    System.out.println("The value of the Opearation (a + b * c)is " + a+b*c );
    System.out.println("The value of the Opearation (a * b + c)is " + a*b+c );
    System.out.println("The value of the Opearation (c + a / b)is " + c+a/b );
    System.out.println("The value of the Opearation (a % b + c)is " + a%b+c );
}
} 
