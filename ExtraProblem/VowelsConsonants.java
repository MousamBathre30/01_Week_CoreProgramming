import java.util.Scanner;

public class VowelsConsonants{


   public static void getVowelConsonants(String str){
	   
	   int countOfVovel = 0;
	   int countOfConsonet = 0;
	   for(int i=0; i<str.length(); i++){
		   if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == '0' || str.charAt(i) == 'u' || str.charAt(i) == 'i' ){
			   countOfVovel++;
		   }else{
			   countOfConsonet++;
		   }
		   
	   }
	   
	   System.out.println("Count of vovel is " +  countOfVovel);
	   System.out.println("Count of consonent is " + countOfConsonet);
	   
   }


   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str = scanner.nextLine();
	   
	   getVowelConsonants(str);

	   
   }
  
}