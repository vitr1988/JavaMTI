package ru.edu.mti.oop;

public class AutomobileTest extends Object {

	public static void main(String[] args) {
//		Automobile suzukiSx4 = new Automobile(90, "Suzuki", 1200.5, "black");
//		suzukiSx4.moveTo("Moscow");
//		
//		Automobile ladaPriora = new Automobile(60, "Lada", 1100, "silver");
//		ladaPriora.moveTo("Samara");
//		
//		Automobile porsche = new Automobile(180, "Porsche", 2000, "white");
//		porsche.moveTo("Saint-Peterburg");
		
		Truck volvo = new Truck(60, "Volvo", 5000, "red", 100);
		volvo.moveTo("Ekaterinburg");
		
		new Truck().moveTo("Hanty-Mantiisk");
	}
}
