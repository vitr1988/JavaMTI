package ru.edu.mti.oop;

public class FlyingCar extends Automobile {

	@Override
	void moveTo(String city) {
		System.out.println("Fly!");
	}
	
	@Override
	void recharge(){
		System.out.println("Recharge with help energy!");
	}

	@Override
	void repair() {
		// TODO Auto-generated method stub
		
	}
}
