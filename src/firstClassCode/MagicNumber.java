package firstClassCode;

import java.util.Scanner;

public class MagicNumber {
	static int intNumber=0;
	public static void main(String[] args) {
		System.out.println("Please enter the number");
		
		Scanner objNumber=new Scanner(System.in);
		
		String UserInputNumber=objNumber.nextLine();
		
		
		String[] strTemp=UserInputNumber.split("");
		
		
		for(int i=0;i<UserInputNumber.length();i++) {
			
			intNumber=intNumber + Integer.valueOf(strTemp[i]);
			System.out.println(intNumber);		
		}
		if(intNumber==10) {
			System.out.println("It's a magic number :"+intNumber);		}
		else
		{
			System.out.println("It's not a magic number :"+intNumber);
		}
		
		

	}

}
