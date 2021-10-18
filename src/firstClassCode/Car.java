package firstClassCode;



public class Car {
	
	String color="RED";
	
	
	//Constructor
	public Car(){
		System.out.println("Car running very fast");
	}
	
	
	/*Method overloading*/
	//Without static
	public void Break(){		
		
		System.out.println("Applying break stop the car");
	}
	
	//Without static
	public void Break(String ModelCar){		
		
		System.out.println(ModelCar+" :Applying break stop the car");
	}
	
	//With static
	public static void Accelarator(){		
		
		System.out.println("Accelarator increase the speed");
	}
	
	
	public static void main(String[] args) {
		
		Car objCar=new Car();		
		objCar.Break();
		objCar.Break("Volvo");
		
		
		System.out.println(objCar.color);
		Accelarator();
		
		
	}


	

	
	

}
