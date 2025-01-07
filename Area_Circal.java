import java.util.*;

public class Area_Circal{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the radius");
     float radius = scanner.nextInt();
     float pi = 3.14;
     float area_Circal = (pi * (radius*radius) );
     System.out.println("The Area of Circle " + area_Circal );
}
}