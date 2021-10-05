package firstClassCode;


abstract class vechicle{
	
	 abstract void start() ;
	 
	 public  void electricars() {
		 System.out.println("Self start");
	 }
	
}

class cars extends vechicle {
	
	public void start() {
		System.out.println("Cars starting by key");
	}
	
}
class scooter extends vechicle {
	
	public void start() {
		System.out.println("Scooter starting by Kick");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
	
		cars c= new cars();
		c.electricars();
		c.start();
		
		scooter s = new scooter();
		s.start();
		s.electricars();		
	
		
	}

}
