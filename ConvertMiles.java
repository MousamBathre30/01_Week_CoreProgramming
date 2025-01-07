import java.util.*;

public class ConvertMiles{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("**************Welcome to program ********");
     System.out.println("**************enter the value of distance in kilometer ********");
     double kilo_meter = scanner.nextInt();
     double miles = kilo_meter * 0.621371;
     System.out.println("The distance in the mile " + miles);
}
}