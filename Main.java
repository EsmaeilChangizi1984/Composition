package Composition;

public class Main {

	public static void main(String[] args) {
		// COMPOSITION has a relation where as inheritance is a relation.
		Dimension dimension = new Dimension(20,20,5);
		Case theCase = new Case("220D","Dell","240",dimension);
		
		Monitor monitor = new Monitor("13 inch","Apple",13,new Resolution(2450,1750));
		Motherboard motherboard = new Motherboard("BJ400","ASUS","V2.66",4,6);
		
		PC pc = new PC(theCase,monitor,motherboard);
		pc.getMonitor().drewPixel(1500, 1200, "Yellow");
		pc.getMotherboard().loadProgram("MAC Big Sur.");
		pc.getTheCase().powerButton();
		
		
      
	}

}
