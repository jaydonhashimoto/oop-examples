package dynamic_polymorphism_example;

public class TestBird {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.eat();

		Bird myBird = new Bird();
		myBird.eat();
	}

}
