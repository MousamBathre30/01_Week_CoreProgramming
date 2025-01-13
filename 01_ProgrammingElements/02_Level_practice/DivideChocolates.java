import java.util.Scanner;

public class DivideChocolates {

      public static void main (String args[]){
      
        System.out.println("Enter the number of children and Chocolates !");

          Scanner scanner = new Scanner(System.in);
          
      
          
          int children = scanner.nextInt();
          
          int chocolates = scanner.nextInt();
          
          int distributedChocolates = chocolates / children;
          
          int remainingChocolates = chocolates % children;
       
         System.out.println("The number of chocolates each child gets is " + distributedChocolates +  "and the number of remaining chocolates are " + remainingChocolates ); 

} 
}