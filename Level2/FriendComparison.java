import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static double [] calculatebmi(double weight , double height) {
         
		 double bmi = new bmi [10];
		 
		 for(int i=0; i<10; i++){
			 bmi [i] = weight[i]/ height[i] * height[i];
		 }
		 return bmi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the weight 
		
		double [] weight = scanner.nextDouble();
		
		// enter the height.
		
		double[] heights = scanner.nextDouble();
		
        double[] bmi = calculatebmi(weight , height);
		
		double [][] bmi2d = calculatebmi2d(weight,height,bmi);

        scanner.close();
    }
}
