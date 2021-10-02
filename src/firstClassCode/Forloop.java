package firstClassCode;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {

		
//		int intial=55;
		System.out.println("Enter student number");
		Scanner obj1=new Scanner(System.in);
		
		int intial=obj1.nextInt();
		
//		for (int intial=0; intial<10  ;intial++  ) {
			
//			System.out.println(intial);
			
			if(intial>=60 ) {
				
				System.out.println("First Division");
				
			}
			else if (intial>60 && intial>=45 ){
				
				System.out.println("second position");
				
			}
			else {
				System.out.println("third position");
			}
	
			
//		}

	}

}


//student 60% first position
//student  45% second position
//student below 45% third position
//
//
//&&
// 1 0
//
//
//||
//
//1 0 




