package abstraction_example;

public class Fish extends Animal {

	@Override
	void move() {
		System.out.println("Moves by flying.");
	}

	@Override
	void eat() {
		System.out.println("Eats seafood.");
	}

}
