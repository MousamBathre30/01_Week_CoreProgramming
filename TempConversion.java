import java.util.Scanner;

public class TempConversion{
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Temprature in Celcius !");
    double tempCelsius = scanner.nextDouble();
    
    double farenheitResult  = (tempCelsius * 1.8 ) + 32;

    // calculate the farenheitResult 
     
    
    System.out.println("The value of the farenheitResult  is " + farenheitResult  );
    System.out.println("the " + tempCelsius + "Celsius is " + farenheitResult + "Fahrenheit" );
    }
} 
