import java.util.*;

public class Exponent{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("**************Enter the two number ********");
     double one = scanner.nextInt();
     double two = scanner.nextInt();
     double answer = Math.pow(one,two);
     System.out.println("The volume of Cylinder " + answer);
}
}