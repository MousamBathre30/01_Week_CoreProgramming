import java.util.Scanner;

public class AreaOfTrangle{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the base and height !");
    float base = scanner.nextFloat();
    float height = scanner.nextFloat();

    // calculate the Area of trangle 
    
    double areaOfTrangle = (0.5 * base * height);

    System.out.println("The area of trangle is " + areaOfTrangle + "where the base and height is " + base + " , " + height);

  }  
} 
