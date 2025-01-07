import java.util.*;

public class SimpleInterest{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("**************Enter the Principal, rate and time ********");
     double principal = scanner.nextInt();
     double rate = scanner.nextInt();
     double time = scanner.nextInt();
     double simple_Interest = (principal * rate * time )/100;
     System.out.println("The Simple Interest " + simple_Interest);
}
}