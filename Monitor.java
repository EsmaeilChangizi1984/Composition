package Composition;

public class Monitor {
	private String model;
	private String brand;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String brand, int size, Resolution nativeResolution) {
		
		this.model = model;
		this.brand = brand;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drewPixel(int x,int y,String color) {
		System.out.println("Drew pixel at "+x+","+y+" "+color+" color.");	
	}

	public String getModel() {
		return model;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	
	
	

}
