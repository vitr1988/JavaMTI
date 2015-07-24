package ru.edu.mti.oop;

public abstract class Automobile extends Object {

	protected int speed;
	String brand;
	final double weight;
	String color;
	
	Automobile(){
		this(0, "Lada", 1000, null);
	}
	
	Automobile(int sp, String br, double w, String c){
		this.speed = sp;
		this.brand = br;
		this.weight = w;
		this.color = c;
		
		this.print();
	}
	
	void moveTo(String city){
		System.out.println("We are going to move in " + city);
	}
	
	void print(){		
		System.out.println(
			"Speed is " + speed + ";" + 
			"Brand is " + brand + ";" + 
			"Weight is " + weight + ";" + 
			"Color is " + color);
	}
	
	final void redraw(String col){
		this.color = col;
	}
	
	String getColor(){
		return color;
	}
	
	abstract void recharge();
	
	abstract void repair();
	
	void crash(){
//		weight = 0;
	}
}
