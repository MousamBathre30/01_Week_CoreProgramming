import java.util.Scanner;

public class TempConversionInFahrenhit {
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Temprature in Celcius !");
    double tempFahrenheit = scanner.nextDouble();
    
    double celsiusResult   = (tempFahrenheit - 32 ) * 0.55;

    // calculate the farenheitResult 
     
    
    System.out.println("The value of the celsiusResult  is " + celsiusResult  );
    System.out.println("the " + tempFahrenheit + "farenheit is " + celsiusResult + "celsius" );
    }
} 
