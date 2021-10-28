package firstClassCode;


interface Animal{
	
	public void animalSound();
	//public void sleep();
	//public void walk();	
}


class Pig implements Animal {
	
	public void animalSound(){
		System.out.println("All animal do the sound");
	}
}



public class Interface {

	public static void main(String[] args) {
	
		Pig objSound= new Pig();
		objSound.animalSound();
		
	}

}





