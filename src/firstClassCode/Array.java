package firstClassCode;

public class Array {

	public static void main(String[] args) {
				
//		int Chetan[];		
//		String Ishware[];
//		
//		Chetan =new int[4];
//		
//		Ishware=new String[3];
//		
//		Chetan[0]=1;
//		Chetan[1]=3;
//		Chetan[2]=5;
//		Chetan[3]=6;
//		
//		Ishware[0]="Mohan";
//		Ishware[1]="Ravi";
//		Ishware[2]="Ram";
		
//		System.out.println(Chetan[0]);
//		System.out.println(Ishware[0]);
		
		int Chetan[]= {1,3,4,5,8,9};
		String Ishware[]= {"Mohan","Ravi","Ram"};
		
		for(int i=0;i<Chetan.length;i++) {
		System.out.print(Chetan[i]+" ");
		}
		System.out.println("\n");
		for(int i=0;i<Ishware.length;i++) {
		System.out.print(Ishware[i]+" ");
		}
		
		int Chetan1[]=Chetan.clone();
		System.out.println("\n");
		for(int i=0;i<Chetan.length;i++) {
			System.out.print(Chetan1[i]+" ");
			}
		System.out.println("\n");
		System.out.println("Checking clone array is same or not? ::"+(Chetan==Chetan1));
		
	}

}
