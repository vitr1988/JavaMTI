package ru.edu.mti.oop;

public class Truck extends Automobile {

	public static final double PI = 3.142;
	
	private int loadCapacity; // in tonnes
	
	public static int markId = 1;
	
	Truck(){
		super();
//		this.weight = -1;
		this.speed = 100;
	}
	
	Truck(int sp, String br, double w, String c, int loadCap){
		super(sp, br, w, c);
		setLoadCapacity(loadCap);
	}
	
	int getLoadCapacity(){
		return loadCapacity;
	}
	
	void setLoadCapacity(int loadCapacity){
		this.loadCapacity = loadCapacity;
	}
	
//	@Override
//	void redraw(String color){
//		super.redraw(color);
//		System.out.println(color);
//	}
	
	static void redraw(int color){
		System.out.println(color);
	}

	@Override
	void moveTo(String city) {
		System.out.println("Drive with help wheels!");
	}
	@Override
	void recharge(){
		System.out.println("Recharge with help petrol!");
	}

	@Override
	void repair() {
		// TODO Auto-generated method stub
		
	}
	
}
