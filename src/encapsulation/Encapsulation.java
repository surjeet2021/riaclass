package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee objEmp=new Employee();

		
		
		objEmp.setNameOfEmployee("surjeet");		
		System.out.println(objEmp.getNameOfEmployee());
		
		
		objEmp.setNameOfEmployee("Chetan");
		objEmp.setSalaryOfEmployee(10000000);	
		System.out.println("Employee name is :"+objEmp.getNameOfEmployee());
		System.out.println("Employee salary is :"+objEmp.getSalaryOfEmployee());
		
		
	}

}
