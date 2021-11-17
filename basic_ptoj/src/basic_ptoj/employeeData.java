package basic_ptoj;


public class employeeData {
	
//	private employeeData(){
//		System.out.println("Constructor IN EmpData");
//	}
	
	
	public static void main(String[] args) {
		
		/*Constructors - 
		 * Is a special type of method which is called when the object of the class is created. 
		 * It assigns values to the class variable to that specific object or initializes the object.
		 * There are two types of constructors on java	
		 * 	a. No argument constructor.
		 * 	b. Parameterized constructor.	 
		 * Rules for creating a constructor 
		 * 	a. Constructor name must be same as the class name.
		 * 	b. A constructor cannot be static. 
		 * 	c. A constructor cannot have a return type.      
		 * 
		 * Hint - Every time an object is created with the new keyword a constructor is called. 
		 * 
		 **/
		
		
		
		
		
		Employee Harini = new Employee("Harini",44289,"female",29,350000);
		Harini.showData();
//		System.out.println("Harsh in employee data "+Harini);
		
//		System.out.println(Employee.CompanyName);
		
//		Employee Rohit = new Employee(); 
//		Rohit.empAge=25;
//		Rohit.empGender="male";
//		Rohit.empName="Rohit";
//		Rohit.empId=552;
//		Rohit.empSalary=12345;
//		Rohit.showData();
//		
//		Employee Sridhar = new Employee(); 
//		Sridhar.empAge=40;
//		Sridhar.empGender="male";
//		Sridhar.empName="Sridhar";
//		Sridhar.empId=812;
//		Sridhar.empSalary=212345;
//		Sridhar.showData();
//		System.out.println(Sridhar.empName+" with ID "+Sridhar.empId+" and age "+Sridhar.empAge+" and gender "+Sridhar.empGender+" has a salary of "+Sridhar.empSalary+" in company "+Employee.CompanyName);
	
//		Employee Harish = new Employee();
		//Harish.showData();	
		
	}

}
