import java.util.*;

public class PerameterRectangle{
  public static void main (String args[]){
     Scanner scanner = new Scanner(System.in);
     System.out.println("**************Enter the length and width********");
     double length = scanner.nextInt();
     double width = scanner.nextInt();
     double parameter_Reactangle = 2*(length + width );
     System.out.println("Parameter Reactangle " + parameter_Reactangle);
}
}