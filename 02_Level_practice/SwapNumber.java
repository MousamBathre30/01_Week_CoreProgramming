import java.util.Scanner;

public class SwapNumber {
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number a and b !");
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
     int temp;

    // Swap the number 
    
      temp = a;
      a = b;
      b = temp; 
      System.out.println("The Swapped number are " + a + " and " + b);
    }
} 
