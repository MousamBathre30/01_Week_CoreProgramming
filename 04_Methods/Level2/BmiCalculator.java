import java.util.Scanner;

public class BmiCalculator {

    // Method to find the youngest friend
    public static double [] calculatebmi(double [] weight , double [] height) {
         
		 double [] bmi = new bmi [10];
		 
		 for(int i=0; i<10; i++){
			 bmi [i] = weight[i]/ height[i] * height[i];
		 }
		 return bmi;
    }
	
	 public static double [] calculatebmi2d(double [] weight , double [] heights, double [] bmi) {
         
		 double bmi2d [][] = new bmi2d [10][3];
		 
		 for(int i=0; i<10; i++){
			 for(int j=0; j<3; j++){
				 if(j==0){
					bmi2d[i][j] = weight[i];
				 }
				 if(j==1){
					bmi2d[i][j] = height[i]; 
				 }
				 if(j==2){
					bmi2d[i][j] = bmi[i]; 
				 }
				 
			 }
			
		 }
		 return bmi2d;
    }
	
	public static void display (double [][] bmi2d){
		
		
		for(int i=0; i<10; i++){
			for(int j=0; j<3; j++){
				if(j==2){
					if(bmi2d[i][j] <= 18.4){System.out.println(bmi2d[i][j]+ " underWeight");}
					if(bmi2d[i][j]>= 18.4 && bmi2d[i][j]<=24.9){System.out.println(bmi2d[i][j]+ " Normal");}
					if(bmi2d[i][j] >= 25.0 && bmi2d[i][j] <= 39.9){System.out.println(bmi2d[i][j]+ " OverWeight");}
					else{System.out.println(bmi2d[i][j]+ " Obese");}
					
				}
				System.out.println("calculatebmi2d" + bmi2d[i][j]);
			}
		}
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the weight 
		
		double [] weight = scanner.nextDouble();
		
		// enter the height.
		
		double[] heights = scanner.nextDouble();
		
        double[] bmi = calculatebmi(weight , heights);
		
		double [][] bmi2d = calculatebmi2d(weight,heights,bmi);
		
		System.out.println(display(bmi2d));
		

        scanner.close();
    }
}
