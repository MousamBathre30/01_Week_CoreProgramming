import java.lang.Math;
import java.util.Scanner;
public class ConvertDis{
  
  public static void main(String args[]){
     /*
Create a program to convert distance in kilometers to miles.

    */
    
    Scanner scanner = new Scanner(System.in);
    double distance = scanner.nextDouble();
    double mile = distance * 1.6 ;
    System.out.println("The Total miles is " + mile + "mile for the given " distance + "KM");
}
  
}