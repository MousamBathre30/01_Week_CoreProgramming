import java.util.*;

public class Average_Number{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("**************Enter the three number ********");
     double one = scanner.nextInt();
     double two = scanner.nextInt();
     double three = scanner.nextInt();
     double answer = (one+two+three)/3;
     System.out.println("The average of three number " + answer);
}
}