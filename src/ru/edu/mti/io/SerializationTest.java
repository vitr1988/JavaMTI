package ru.edu.mti.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ru.edu.mti.oop.SportCar;

public class SerializationTest {

	public static void main(String[] args) {
		SportCar car = new SportCar(280, "Lambo", 1500, "white");
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("sportcar.ser"));
			outputStream.writeObject(car);
			outputStream.flush();
			outputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
