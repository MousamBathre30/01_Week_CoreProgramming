import java.util.Scanner;
import java.util.*;
public class CalculateQuadratic {

    // Method to calculate calculateDelta
    public static  double [] calculateDelta(int a, int b,int c)  {
       double delta = 0;
	   
	    delta = Math.pow(b,2)-(4*a*c);
	   double [] rootOfx = new double[2];
	  if(delta > 0){ 
	  rootOfx[0] = (-b + Math.sqrt(delta))/(2*a);
	  rootOfx[1] = (-b - Math.sqrt(delta))/(2*a);
	  }
	  if(delta < 0){ 
         return rootOfx;
	  }
	  if(delta ==0){ 
	  rootOfx[0] = (-b /(2*a));
	  rootOfx[1] = (-b /(2*a));
	  } 
        return rootOfx;
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Input weights
        System.out.println("Enter a b c as input ");
        int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();


        double  [] ans = calculateDelta(a,b,c);
	    
		System.out.println("the root are " + ans[0] + " " + ans[1]);
		
		

        scanner.close();
    }
}
