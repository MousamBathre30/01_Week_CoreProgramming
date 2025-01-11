import java.util.Scanner;

public class TriangularPark{

      public static void main (String args[]){
      
        System.out.println("Enter the sides !");

          Scanner scanner = new Scanner(System.in);
          
          int distance = 5; 
          
          int side = scanner.nextInt();
          
          int perimeterOfTriangle = 3*side;

          int round = perimeterOfTriangle/distance    ;
       
         System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km" ); 

} 
}