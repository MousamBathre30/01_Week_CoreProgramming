import java.util.Scanner;

public class TotalPrice{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the UnitPrice and Quentity !");
    int unitPrice = scanner.nextInt();
    int quentity = scanner.nextInt();


    // calculate the total price 
    
    int totalPrice = unitPrice * quentity;
    

    System.out.println("The  total purchase price is INR  " + totalPrice + " if the quantity  " + quentity + "and unit Price is INR " + unitPrice );
  }  
} 
