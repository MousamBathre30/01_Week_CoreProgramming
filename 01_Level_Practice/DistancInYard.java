import java.util.Scanner;

public class DistancInYard{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Distance in Feet !");
    double distanceInfeet = scanner.nextDouble();
    

    // calculate the distance in yards and miles 
    
    double distanceInYard = 0.33 * distanceInfeet;
    double distanceInMile = distanceInYard * 0.00056; 
    

    System.out.println("The distand in yard is  " + distanceInYard + " the distance in mile is  " + distanceInMile );
  }  
} 
