package firstClassCode;

class Bike {
	
	void run(){
		System.out.println("running");
	}
	
}

public class Splendor extends Bike{
	
	void run(){
		System.out.println("running bike at 60km safely");
	}

	public static void main(String[] args) {

		Bike objrun=new Splendor();
		objrun.run();
	}

}
