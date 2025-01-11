import java.util.Scanner;

public class TotalIncome {
  
  public static void main(String args[]){
    
    // Creating Scanner for input 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Salary and Bonus !");
    
    int salary = scanner.nextInt();
    int bonus = scanner.nextInt();
     

    // calculate the Total income 
    
   int totalIncome = salary + bonus ;
 
    System.out.println("The salary is INR " + salary + "and bouns is INR " + 
      bonus + " .Hence Total Income is INR " + totalIncome); 
    
    
    }
} 
