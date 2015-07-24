package ru.edu.mti.oop;

import static ru.edu.mti.oop.Truck.PI;
//import static ru.edu.mti.oop.WorldTree.PI;
import static ru.edu.mti.oop.WorldTree.printPI;

public class WorldTreeTest {

	public static void main(String[] args) {
		WorldTree merryChristmaTree = new WorldTree(2, "merryChristmaTree");
		WorldTree oak = new WorldTree(4, 15, "oak");
		WorldTree bereza = new WorldTree(1, 20, "bereza");
		
		merryChristmaTree.setHeight(oak); //merryChristmaTree.height = 4
		
		System.out.println(PI);
		printPI();
		System.out.println(WorldTree.PI);
		
	}
}
