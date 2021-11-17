package techAcademy;

import java.util.Scanner;

public class FourNumbers {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("first number: ");
        int num1 = in.nextInt();
        System.out.print("second number: ");
        int num2 = in.nextInt();
		 System.out.print("third number: ");
        int num3 = in.nextInt();
        System.out.print("fourth number: ");
        int num4 = in.nextInt();		
		
		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                              }
		else
			{
			System.out.println("Numbers are not equal!");
		}
		 in.close();
	}
}
