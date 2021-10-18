package firstClassCode;

public class LargestInArrayExample {
	
	public static void main(String[] args) {
		int [] array1 = new int [] {2,11,9,8,10};
		
		int TempVariable=0;
		for(int i=0;i<array1.length;i++) {
			
			for(int j=i+1;j<array1.length;j++) {
				
				
				if(array1[i]>array1[j]) {
					
					TempVariable=array1[i];
					
					array1[i]=array1[j];
					
					array1[j]=TempVariable;					
				}
				
				
				
			}
		}
		
		System.err.println(array1[array1.length-1]);

	}

}
