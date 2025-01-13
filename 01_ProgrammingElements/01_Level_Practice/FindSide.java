import java.util.Scanner;

public class FindSide{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Perimeter !");
    double Perimeter = scanner.nextFloat();
    

    // calculate the side of square 
    
    double side = Perimeter/4;

    System.out.println("The length of the side is " + side + "where the Perimeter is  " + Perimeter );
  }  
} 
