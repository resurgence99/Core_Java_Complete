package basic_ptoj;

public class For_loop {
	public static void main(String[] args) {
		int counter=0;
		for(int num= 21; num<=51; num++) {
            if(num%2==0) {
				if(num%10==0) {
					num++;
					continue;
					}
				else {
				System.out.println(num+" is even. ");
				}
			}
			else {
				counter++;
				System.out.println(num+" is odd. ");
			}
		}
		System.out.println("The total number of odd values are "+counter+".");
	}

}
