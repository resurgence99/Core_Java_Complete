package techAcademy;

import java.util.Scanner;

public class Betweenzto {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("first number: ");
        double n1 = in.nextDouble();
        System.out.print("second number: ");
        double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
		 in.close();
	}
}
