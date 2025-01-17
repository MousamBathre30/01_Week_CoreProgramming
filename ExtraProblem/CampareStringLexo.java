import java.util.Scanner;

public class CampareStringLexo{


   public static void getlexo(String str1 , String str2){
	   
	   int n = str1.length();
	   int m = str2.length();
	   int length = Math.min(n,m);
	   int count = 0;
	  for(int i=0; i<length; i++){
		if(str1.charAt(i) > str2.charAt(i)){
			System.out.println("First is " + str2);
			break;
		} else if(str1.charAt(i) < str2.charAt(i)){
			System.out.println("First is " + str1);
			break;
		} else{
			count++;
		}
	  }

     if(count == length){
		 System.out.println("Both are simmiler");
	 } 	  
        
	   
   }


  

   public static void main(String args[]){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   // enter the string 
	   String str1 = scanner.nextLine();
 	   String  str2 = scanner.nextLine();
	   
	   getlexo(str1 , str2);
     
   }
  
}