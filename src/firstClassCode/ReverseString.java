package firstClassCode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter string for reverse");
		
		
	     Scanner objInput=new Scanner(System.in);
	     
	     
	     
	     String stringvalue=objInput.nextLine();
	     
	
		
        char chars[] = stringvalue.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }

	}

}
