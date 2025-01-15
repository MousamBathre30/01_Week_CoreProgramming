

import java.util.Scanner;
public class Freq{

public static int [] getPresent(String str){
	  int n= str.length();
	  String temp = "";
	   int [] chararray = new int[26];
	   for(int i=0; i<n; i++){

	   chararray[str.charAt(i) - 'a']++;
		   
		   }
	   
	   
	   // abc 
	   return chararray;
	  
 
  }
  
  public static void display(int array [], String str){
	  
	  String [][] displayfreq = new String[2][2]; 
	  for(int i=0; i<str.length(); i++){
		  displayfreq[0][i] =  String.format("%f" , array[i]);
		  displayfreq[1][i] =  str.charAt(i);
	  }
	  
	   for(int i=0; i<str.length(); i++){
		  System.out.println(displayfreq[0][i]); 
		  System.out.println(displayfreq[1][i] );
	  }
	  
  }
  
  
  
   public static void main(String args[]){
   
   
   
    Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
    int [] array = getPresent(str);
	display(array , str);
   }
  
  
  }