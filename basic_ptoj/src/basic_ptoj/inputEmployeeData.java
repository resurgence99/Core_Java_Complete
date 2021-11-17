package basic_ptoj;

import java.util.Scanner;

public class inputEmployeeData {
	
public static Employee createEmployee(){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter your employee ID");
		int empId = inp.nextInt();
		System.out.println("Enter your name");
		String empName = inp.next();
		System.out.println("Enter your gender");
		String empGender = inp.next();
		System.out.println("Enter your Age");
		int empAge = inp.nextInt();
		System.out.println("Enter your Salary");
		int empSalary = inp.nextInt();

		Employee name = new Employee(empName,empId,empGender,empAge,empSalary);
		return name;
		
	}

	public static void main(String[] args) {


		Employee Harsh = createEmployee();
		Harsh.showData();
		
		Employee John = createEmployee();
		John.showData();

	}

}
