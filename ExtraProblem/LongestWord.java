import java.util.Scanner;

public class LongestWord{


   public static void getlongestword(String str){
	   
	   // create a char [] = 26 size 
	   
	 
	   
	   int count = 0;
	   int currentanslength = 0;
	   String currentword = "";
	   String curretAnswer = "";
	   int n = str.length();
	   int currentwordlength = 0;
	   
	   for(int i=0; i<n; i++){
		   if(str.charAt(i) == (' ')){
			   if(currentwordlength > currentanslength){
				   currentanslength = currentwordlength;
				   curretAnswer = currentword;
			   }
				   currentword = "";
				   currentwordlength=0;
			   
			 
	   }  else{

		   currentword += str.charAt(i);
		   currentwordlength++;
	   }
	   }
	   System.out.println("longest String is  " + curretAnswer + "  " + currentanslength);
	   
   }


  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine();
	   
	   getlongestword(str);
     
   }
  
}