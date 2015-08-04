package ru.edu.mti.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ru.edu.mti.oop.SportCar;

public class DeserializationTest {

	public static void main(String[] args) {
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("sportcar.ser"));
			Object car = inputStream.readObject();
			if (car instanceof SportCar){
				SportCar sportCar = (SportCar) car;
				System.out.println(sportCar.getBrand());
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
