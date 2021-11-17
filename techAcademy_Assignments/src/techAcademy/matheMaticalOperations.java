package techAcademy;

import java.util.Scanner;

public class matheMaticalOperations {
	
	void add(int a,int b) {
		System.out.println("Addition of two number = "+(a+b));
	}
	
	void sub(int a,int b) {
		System.out.println("Subtraction of two number = "+(a-b));
	}
	
	void mul(int a,int b) {
		System.out.println("Multiplication of two number = "+(a*b));
	}
	
	void rem(int a,int b) {
		System.out.println("Remainder of two number = "+(a%b));
	}
	
	void div(int a,int b) {
		System.out.println("Division of two number = "+(a/b));
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		matheMaticalOperations obj = new matheMaticalOperations();
		int a,b;
		System.out.println("Enter two numbers");
		System.out.print("First Number: ");
		a=sc.nextInt();
		System.out.print("Second Number: ");
		b=sc.nextInt();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.rem(a,b);
		obj.div(a,b);
		sc.close();
	}

}
