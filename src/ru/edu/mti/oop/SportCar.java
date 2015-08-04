package ru.edu.mti.oop;

public final class SportCar extends Automobile {

	private static final long serialVersionUID = 8149533639476468530L;

	public SportCar(){}
	
	public SportCar(int sp, String br, double w, String c){
		super(sp, br, w, c);
	}
	@Override
	void recharge() {
		System.out.println("Recharge with oil!");
	}

	@Override
	void repair() {
		// TODO Auto-generated method stub
		
	}
	
	public String getBrand(){
		return this.brand;
	}

}
