package basic_ptoj;

public class Employee {

	public static String CompanyName ="ITC Infotech";
	
	public String empName;
	public int empId;
	public String empGender;
	public int empAge;
	protected int empSalary;
	
	public Employee(String empName,int empId,String empGender,int empAge,int empSalary)
	{
//		System.out.println("I am the constructor");
		 this.empName = empName;
		 this.empId = empId;
		 this.empGender = empGender;
		 this.empAge = empAge;
		 this.empSalary = empSalary;
//		 System.out.println("This keyword in employee construcor"+this);
	}
	
	public static void Works() {
		System.out.println("Works with "+CompanyName);
	}
	
	public void showData() {
		System.out.println(empName+" with ID "+empId+" and age "+empAge+" and gender "+empGender+" has a salary of "+empSalary+" in company "+CompanyName);
	}
}

/* Everytime you run java code your code is executed. 
 * 	Step 1 - Code is compiled. 
 * 	Step 2 - Static variables are loaded in the memory. 
 * 	Step 3 - Instance variables are loaded in memory when objects of the class are created.
 * 	*/
 