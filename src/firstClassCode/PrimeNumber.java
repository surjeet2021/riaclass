package firstClassCode;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Please enter any number");
		
		Scanner objEnterValue=new Scanner(System.in);
		int userinputnumber=objEnterValue.nextInt();
					
		boolean notAdanger=false;
		for(int i=2;i<userinputnumber;i++) {

			if (userinputnumber%i ==0) {
				 notAdanger=false;
				 break;
			}
			else {
				 notAdanger=true;		
			}
		}
		
		if(notAdanger) {
			System.out.println("Given number is prime  "+userinputnumber);
			
		}
		else {
			System.out.println("Given number is not prime  "+userinputnumber);
		}

	}

}
