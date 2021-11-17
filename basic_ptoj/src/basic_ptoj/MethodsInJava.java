package basic_ptoj;

public class MethodsInJava {
	public static void main(String[] args) {
//		evenOrodd(10);
//		evenOrodd(11);
//		evenOrodd(12);
//		System.out.println(addNum(3,3));
		
//		int sum=addNum(5,10);
//		System.out.println(sum);
		String prime = primeNumber(49);
		System.out.println(prime);
	}
	public static void evenOrodd(int num) {
		System.out.println("Checking whether " +num+ " is even or odd");
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}
	
	public static String primeNumber(int a) {
		int i=2;
		while(i<=(a/2))
		{
			if(a%i==0)
			{
				String out= a+" is not a prime number and is divisble by "+i;
				return out;
//				System.out.println(a+" is not a prime number");
//				System.exit(0);
			}
			i++;
		}
		String out= a+" is a prime number";
		return out;
//		System.out.println(a+" is a Prime number");
	}
	
	public static int addNum(int a,int b) {
		int sum=a+b;
		return sum;
	}
}
