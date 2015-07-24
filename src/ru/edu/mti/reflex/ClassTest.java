package ru.edu.mti.reflex;

import java.util.Arrays;

public class ClassTest {

	public static void main(String[] args) {
		
		try {
			Class stringClass = Class.forName("java.lang.String");
			Class stringClass2 = String.class;
			Class stringClass3 = "".getClass();
			
			Object obj = stringClass.newInstance();
			System.out.println(Arrays.toString(stringClass.getDeclaredFields()));
			System.out.println(Arrays.toString(stringClass.getConstructors()));
			System.out.println(Arrays.toString(stringClass.getMethods()));
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
