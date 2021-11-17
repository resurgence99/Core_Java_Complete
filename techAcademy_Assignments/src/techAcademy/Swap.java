package techAcademy;

public class Swap {

	public static void main(String[] args) {
		int a = 50;
		int b = 20;
		System.out.println("Variable a = "+a+" Varaible b = "+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Variable a = "+a+" Varaible b = "+b);
	}
}
