import java.util.Scanner;

public class FindFreqentcharecter{


   public static void getfreq(String str1){
	   
	   int n = str1.length();
       
	   String currentword = "";
	   String  currentAns = "";
	   
	   int currentlength = 1;
	   int currentAnslength = 0;
	   
	   for(int i=0; i<n; i++){
		  for(int j=0; j<n; j++){
			  if(i!=j){
				  if(str1.charAt(i) != str1.charAt(j)){
					  if(currentlength > currentAnslength){
						  currentAnslength = currentlength;
						  currentAns = currentword;
					  }
					  currentword = "";
					  currentlength = 1;
				  }else{
					  currentlength++;
					  currentword+=str1.charAt(i);
				  }
			  }
		  } 
		  
	   }
	   
	   System.out.println("the most freqency word is " + currentAns + " and the length is " + currentAnslength);
	   
   }


  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str1 = scanner.nextLine();
 	  
	   
	   getfreq(str1);
     
   }
  
}