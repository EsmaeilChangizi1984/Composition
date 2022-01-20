package Composition;

public class Case {
	private String model;
	private String brand;
	private String power;
	private Dimension dimension;
	
	public Case(String model, String brand, String power, Dimension dimension) {
		this.model = model;
		this.brand = brand;
		this.power = power;
		this.dimension = dimension;
	}
	
	public void powerButton() {
		System.out.println("Power button pressed.");
	}
	public String getModel() {
		return model;
	}
	public String getBrand() {
		return brand;
	}
	public String getPower() {
		return power;
	}
	public Dimension getDimension() {
		return dimension;
	}
	
	

}
