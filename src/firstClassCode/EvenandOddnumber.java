package firstClassCode;

public class EvenandOddnumber {

	public static void main(String[] args) {
//		How many even and odd 1--->20?
		
		String intEvenNumber= "";
		String intOddNumber= "";
		
		for (int i=1; i<=20;i++) {
			if (i%2==0) {
				
				intEvenNumber=intEvenNumber+" "+i;
				
			}
			else
			{
				
				intOddNumber=intOddNumber+" "+i;
				
			}	 
			
		}
		
		System.out.println(intEvenNumber+" are even number \n"+intOddNumber+" are odd number ");

	}

}

