import java.util.Scanner;

public class TotalDistanceInput{

      public static void main (String args[]){
         String user = "Eric";
         /*
               Chennai --- Vellore ---- Bangalore
         */

          Scanner scanner = new Scanner(System.in);
          String viacity = scanner.next();
          String  presentcity = scanner.next();
          String  destinationcity = scanner.next();
          double viacityDistance = scanner.nextDouble();
          double presentcityDistance = scanner.nextDouble();
          int timeTakenViaCity = scanner.nextInt();
          int timeTakenPresent = scanner.nextInt();
        
         double totaldistance = viacityDistance + presentcityDistance;
         int totaltime = timeTakenViaCity + timeTakenPresent;
         System.out.println("The total distance cover by " + user + " " + " is " + totaldistance + user + 
           " " + totaltime );

} 
}