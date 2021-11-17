package basic_ptoj;

import java.util.Scanner;

//import java.util.*;

public class inputClass {

	public static void main(String[] args) {
		
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
		System.out.println(empName+" with ID "+empId+", aged "+empAge+" and gender as "+empGender+" has a salary of "+empSalary);
		
		
	}

}
