package techAcademy;
import java.util.*;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("Enter ten numbers");
		for(int i=0;i<10;i++)
		{
			int num = sc.nextInt();
			sum+=num;
		}
		double average = sum/10;
		System.out.println(average);
		
		sc.close();
	}

}
