import java.lang.Math;
public class VolumeEarth{
  
  public static void main(String args[]){
     /*
Write a Program to compute the volume of Earth in km^3 and miles^3


    */
    
    int radius = 6378;
    double pi = 3.13;
    double mile = radius * 1.6;
    double volumeKilo = (4/3) * pi * Math.pow(radius,3);
    double volumeMile = (4/3) * pi * Math.pow(mile,3);
    System.out.println("Volume of earth in cubic kilometers is " + volumeKilo + "and cublic miles is " + volumeMile );

}
  
}