import java.util.Scanner;

public class WeightConversion {

      public static void main (String args[]){
      
        System.out.println("Enter the  Weight in Pounds !");

          Scanner scanner = new Scanner(System.in);
          
      
          
          double weightInPound = scanner.nextDouble();
          
          double weightInKG =  weightInPound * 2.2;
       
         System.out.println("The weight of the person in pound is " + weightInPound + "and in kg is " + weightInKG); 

} 
}