import java.util.*;

public class VolumeCylinder{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the radius and height");
     double radius = scanner.nextInt();
     double height = scanner.nextInt();
     double pi = 3.14;
     double volume_cylinder = (pi * (radius*radius) * height );
     System.out.println("The volume of Cylinder " + volume_cylinder );
}
}