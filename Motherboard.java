package Composition;

public class Motherboard {
	private String model;
	private String bios;
	private String brand;
	private int ram;
	private int card;
	
	public Motherboard(String model,String bios,String brand,int ram,int card) {
		this.model = model;
		this.bios = bios;
		this.brand = brand;
		this.ram = ram;
		this.card = card;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program "+programName+" loading.");
	}

	public String getModel() {
		return model;
	}

	public String getBios() {
		return bios;
	}

	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	public int getCard() {
		return card;
	}
	
	
	

}
