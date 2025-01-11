import java.util.Scanner;

public class UniversityDiscount{
  
  public static void main(String args[]){
     /*
    The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

    */
    Scanner scanner = new Scanner(System.in);
    double CollageFees = scanner.nextDouble();
    double discountPercent = scanner.nextDouble();
   double discountedAmount = CollageFees * (discountPercent/100.0);
   double payamount = CollageFees - discountedAmount;
   
   System.out.println("The discount amount is INR " + discountedAmount + "and Final discounted fee is INR " + payamount) ;


}
  
} 
