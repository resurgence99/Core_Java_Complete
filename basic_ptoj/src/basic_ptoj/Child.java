package basic_ptoj;

public class Child extends Parent {
	
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println("sum(int a,int b) = "+sum);
	}
	
	public void sum(int a,float b) {
		double sum=a+b;
		System.out.println("sum(int a,float b) = "+sum);
	}
	
	public void sum(float a,int b) {
		double sum=a+b;
		System.out.println("sum(float a,int b) = "+sum);
	}
	
	public void sum(float a,float b) {
		double sum=a+b;
		System.out.println("sum(float a,float b) = "+sum);
	}

	
	public void sum(int a,int b, int c) {
		int sum=a+b+c;
		System.out.println("sum(int a,int b,int c) = "+sum);
	}
	
	public void studyTime() {
		System.out.println("Child define study time is 2pm");
	}
	public void playingTime() {
		System.out.println("Child define playing time is 5pm");
	}
//	public void sleepingTime() {
//		System.out.println("Child define sleeping time is at 12am");
//	}
	
	public void getParentSleepingtime() {
		super.sleepingTime();
	}
}
