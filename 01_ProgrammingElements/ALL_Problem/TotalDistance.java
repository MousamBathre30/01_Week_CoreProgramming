/*
Sample Program 2 - Eric Travels from Chennai to Bangalore via Vellore. From Chennai to Vellore distance is 156.6 km and the time taken is 4 Hours and 4 Mins and from Vellore to Bangalore is 211.8 km and will take 4 Hours and 25 Mins. Compute the total distance and total time from Chennai to Bangalore

*/


public class TotalDistance{

      public static void main (String args[]){
         String user = "Eric";
         /*
               Chennai --- Vellore ---- Bangalore
         */
         double viaVellore = 156.6;
         int  timetakenVellore = 4*60+4;
         double viaBangalore = 211.8;
         int timetakenBangalore = 4*60 + 25;
        
         double totaldistance = viaVellore + viaBangalore;
         int totaltime = timetakenVellore + timetakenBangalore;
         System.out.println("The total distance cover by " + user + " " + " is " + totaldistance + "and total time is taken by " + user + 
           " " + totaltime );

} 
}