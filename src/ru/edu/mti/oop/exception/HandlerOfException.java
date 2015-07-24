package ru.edu.mti.oop.exception;

import java.io.File;
import java.net.MalformedURLException;

public class HandlerOfException {

	public static void main(String[] args) {
		int a = 10, b = 5;
		
		//
		//
		
		
		while(b >= 0) {
			int c;
			try {
				c = a / b;
				File file = new File("src");
				file.toURL();
			}
			catch(ArithmeticException | MalformedURLException  e){
				e.printStackTrace();
				c = 1;
			}
			catch(Throwable e){
				e.printStackTrace();
				c = 3;
			}
//			finally {
//				c = 4;
//			}
			System.out.println(c);
			b--;
		}
		
		System.out.println("1");
	}

}
