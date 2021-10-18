package encapsulation;

public class Employee {
	
	private String name;
//	private int age;
	private double salary;
	
	public  void setNameOfEmployee( String name1) {
		name=name1;		
	}
	
	public  void setSalaryOfEmployee( double salary1) {
		salary=salary1;		
	}
	
	public  String getNameOfEmployee() {
		return name;		
	}
	
	public  double getSalaryOfEmployee() {
		return salary;		
	}

}
