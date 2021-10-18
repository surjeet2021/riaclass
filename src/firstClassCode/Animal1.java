package firstClassCode;





public class Animal1 {
	
	String color="Black";
	String dog(){
		
		System.out.println("This is my dog");
		return color;
		
	}

	public static void main(String[] args) {
		
		Animal1 dogcolor=new Animal1();
		String dogmethod=dogcolor.dog();
		System.out.println(dogmethod);
		
		

	}

}
