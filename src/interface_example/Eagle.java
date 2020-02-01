package interface_example;

public class Eagle implements AnimalInterface, BirdInterface {

	@Override
	public void fly() {
		System.out.println("Flies up to 10,000 feet.");
	}

	@Override
	public void eat() {
		System.out.println("Eats reptiles and amphibians.");
	}

	@Override
	public void sound() {
		System.out.println("Has a high-pitched whistling sound.");
	}

}
