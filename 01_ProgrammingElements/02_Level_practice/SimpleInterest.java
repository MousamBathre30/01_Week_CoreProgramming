import java.util.Scanner;

public class SimpleInterest {

      public static void main (String args[]){
      
        System.out.println("Enter the Principal, Rate and Time !");

          Scanner scanner = new Scanner(System.in);
          
      
          
          int principal = scanner.nextInt();
          
          int Rate = scanner.nextInt();
          
          int Time = scanner.nextInt();
          
          int simpleInterest =  (principal * Rate * Time)/100;
       
         System.out.println("The Simple Interest is " + simpleInterest +  " for Principal " + principal + "Rate of Interest " +  Rate + "and Time " + Time
); 

} 
}