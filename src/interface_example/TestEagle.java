package interface_example;

public class TestEagle {

	public static void main(String[] args) {
		Eagle myEagle = new Eagle();
		myEagle.eat();
		myEagle.sound();
		myEagle.fly();
		
		System.out.println("Number of legs: " + BirdInterface.numberOfLegs);
		System.out.println("Number of legs: " + BirdInterface.outerCovering);
	}

}
