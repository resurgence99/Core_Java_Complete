package basic_ptoj;

public class While_loop {
	public static void main(String[] args) {
		
		int num=21;
		
//		While loop
		while(num!=50) {
//			Logic for even or odd
			if(num%2==0) {
				if(num%10==0) {
					num++;
					continue;
					}
				else {
				System.out.println(num+" is even ");
				}
			}
			else {
				System.out.println(num+" is odd ");
			}
			num++;
		}
		System.out.println("While loop has been ended at "+num);
	}

}
