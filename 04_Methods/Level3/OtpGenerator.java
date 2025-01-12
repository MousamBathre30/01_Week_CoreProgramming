
import java.util.Arrays;

import java.util.Scanner;

public class OtpGenerator{


    public static void getRandom(){
		
		return (int) ( Math.Random()* (999999 - 100000+1)+100000;
	}
	
	public static boolean isUnique(int array){
		
		for(int i=0; i<array.length; i++){
			for(int j=0; i<array.length; j++){
				if(i!=j){
					if(array[i] == array [j]){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	
	public static void display(int array[]){
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

   public void main(String args[]){
   
     Scanner scanner = new Scanner(System.in);
	 
	 int count=10;
	 int array [] = new int[count]; 
	 int i = 0;
	 while(count > 0){
	 array [i] = getRandom();
	 i++;
	 }
	 
	 
	 System.out.println("Generated number is unique or not " +  isUnique(array));
	  System.out.println("Generated number is  " +  display(array)); 
	 
   }
}