package firstClassCode;

import java.util.Scanner;

public class BuzzNumber {
	
	static boolean inputBuzNumber(int intBuzzNumberFromUser){
		
		if(intBuzzNumberFromUser%7==0 || intBuzzNumberFromUser%10==7) {
			
			return true;
			
		}
		else {
			
			return false;	
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner objBuzNumber =new Scanner(System.in);
		
		
		
		int intBuzzNumberFromUser=objBuzNumber.nextInt();
		
		if (inputBuzNumber(intBuzzNumberFromUser))
		 {
			System.out.println("Given number is Buzz number");			
		}
		else {
			System.out.println("Given number is not Buzz Number");	
		}
		
		 intBuzzNumberFromUser=objBuzNumber.nextInt();
		
		if (inputBuzNumber(intBuzzNumberFromUser))
		 {
			System.out.println("Given number is Buzz number");			
		}
		else {
			System.out.println("Given number is not Buzz Number");	
		}		


	}

}
