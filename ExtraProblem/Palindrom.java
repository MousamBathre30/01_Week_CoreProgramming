import java.util.Scanner;

public class Palindrom{


   public static void getPalindrom(String str){
	   
	   int countOfVovel = 0;
	   int countOfConsonet = 0;
	   String temp = "";
	   int n = str.length();
	   for(int i=0; i<n/2; i++){
		   if(str.charAt(i) == (str.charAt(n-1-i))){
			   
			   continue;
		   }else{
			   System.out.println("Not Palindrom");
		   }
		   
		   
	   }

	   System.out.println("given string is Palindrom  ");
	   
   }


   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine().trim();
	   
	   getPalindrom(str);

	   
   }
  
}