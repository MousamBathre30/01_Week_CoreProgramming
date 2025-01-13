import java.util.Scanner;

public class TempConversionInCelcius {
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Temprature in Fahrenheit !");
    double tempFahrenheit = scanner.nextDouble();
    

    // Calculate the
    double celsiusResult   = (tempFahrenheit - 32 ) * 0.55;

   
     
    
    System.out.println("The value of the celsiusResult  is " + celsiusResult  );
    System.out.println("the " + tempFahrenheit + "farenheit is " + celsiusResult + "celsius" );
    scanner.close();
    }
} 
