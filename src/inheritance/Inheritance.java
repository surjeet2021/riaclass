package inheritance;


public class Inheritance extends Animal {

	public static void main(String[] args) {
		
		Animal objAnimal =new Animal();
		
		objAnimal.walk();
		
		Bird objBird = new Bird();
		objBird.walk();
		objBird.eat();
		
	}

}
