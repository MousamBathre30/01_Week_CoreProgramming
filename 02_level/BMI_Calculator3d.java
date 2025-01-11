import java.util.Scanner;

public class BMI_Calculator3d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight (in kg) and height (in cm) 
		System.out.println("enter the person in each team");
		int n = scanner.nextInt();
		
        System.out.print("Enter  weight (in kg) of all person: ");
		
		int weight [] = new weight[n];
		int height [] = new height[n];
		int bmi [] = new bmi[n];
		for(int i=0; i<n; i++){
			weight[i] = scanner.nextInt();
			height[i] = scanner.nextInt();
			
		}
		
      double bmi;
       for(int i=0; i<n; i++){
   // Calculate BMI using the formula: BMI = weight / (height * height)
		 bmi [i] = weight[i] / (height[i] * height[i]);
     
	   }
	   // creating 3d array to store the WEight,Height,Bmi'
	   int m = 3; // denoting the sum of bmi, weight, height
	   int storeBmiHeightWeight [] []  = new int [n][n];
	   
	   for(int i=0; i<m; i++){
		   for(int j=0; j<n; j++){
			   
				   if(i==0){
					 storeBmiHeightWeight[i][j] = weight[j];  
					 System.out.println("persons weight is" + storeBmiHeightWeight[i][j]);
				   }
				   else if(i==1){
     				 storeBmiHeightWeight[i][j] = height[j]  ;
					 System.out.println("persons height is" + storeBmiHeightWeight[i][j]);

				   }
				   else{
					 storeBmiHeightWeight[i][j] = bmi[k] ; 
					 System.out.println("persons bmi is" + storeBmiHeightWeight[i][j]);
	  
				   }   
		   }
	   }
	   
	   
        

        scanner.close();
    }
}
