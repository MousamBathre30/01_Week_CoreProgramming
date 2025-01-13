import java.util.Scanner;

public class ChangeHeight{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    
    // Taking input of the height 
    double heightinFeet = scanner.nextDouble();
     
    /*
        Info :- 1 feet = 12 inches and 1 inch = 2.54 cm
      
    */ 
    // convert in the height ---> foot ---> inches -- > cm
    double heightInCentiMeter = heightinFeet * 12 * 2.54;

    double heightInInches = heightinFeet * 12;

    System.out.println("Your Height in cm is " + heightInCentiMeter + 
     "while in feet is " + heightinFeet + 
     " and inches is  " + heightInInches);

}
  
} 
