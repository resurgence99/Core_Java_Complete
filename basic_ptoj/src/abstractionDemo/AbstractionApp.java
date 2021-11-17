package abstractionDemo;

public class AbstractionApp extends AbstractClassDemo {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void helloTwo() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		//AbstractClassDemo abs = new AbstractClassDemo();
		hi();
	}

}

/*
 * Abstraction - 
 * 	We only expose the functionality to the user and hide the implementation details. 
 * 	There are two ways we can achieve abstraction in java -
 * 		a. Abstract class - 
 * 			It is a class which is declared abstract. 
 * 			It can contain abstract as well as non abstract methods. 
 * 			An object of abstract class cannot be created. 
 * 			An abstract class cannot be instantiated.
 * 			You can extend to an abstract class to use/implement it's methods. 
 * 			It is compulsory for the child class of the abstract class to implement it's abstract methods.
 * 			The amount of abstraction achieved using abstract classes can be anywhere between 0% - 100%.
 * 		b. Interface -
 * 				
 * */
