package techAcademy;

import java.util.Scanner;

public class productOfNumbers {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		System.out.print("First Number: ");
		a=sc.nextInt();
		System.out.print("Second Number: ");
		b=sc.nextInt();
		System.out.println("Product of two number = "+(a*b));
		sc.close();
	}

}
