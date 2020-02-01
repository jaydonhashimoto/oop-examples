package encapsulation_example;

public class Animal {
	private String name;
	private double averageWeight;
	private int numberOfLegs;
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAverageWeight() {
		return averageWeight;
	}
	
	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}
