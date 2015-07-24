package ru.edu.mti.oop;

public class PolymorhismTest {
	
	static int index;
	private String str = "";

	public static void main(String[] args) {
		Automobile[] autos = new Automobile[3];
//		autos[0] = new Automobile();
		autos[0] = new Truck();
		autos[1] = new Truck();
		autos[2] = new FlyingCar();
		
		for(Automobile auto: autos){
			auto.moveTo("Moscow");
		}
		
		autos[0].redraw("black");
		
		((Truck)autos[0]).markId = 7;
		Truck.redraw(100);
		Truck.markId = 10;
		
		System.out.println(autos[1].getColor());
		System.out.println(((Truck)autos[1]).markId);
		
//		int index = 0;
		index = 0;
	}
	
	{
		String test = "Hello World";
		str = "World Hello" + test;
	}
	
	static {
		for (int i = 0; i < 1000; i++){
			if (i == Math.random()* 100){
				index = i;
				break;
			}
		}
	}

	static class Test {
		
	}
	
	public void test(){
		class TestA {
			public void print(){
				System.out.println("Test");
			}
		}
		new TestA().print();
	}
}
