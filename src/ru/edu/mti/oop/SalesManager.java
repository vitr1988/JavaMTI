package ru.edu.mti.oop;

public class SalesManager implements Manager {

	@Override
	public void communicate() {
		System.out.println("Communication with trade presenters!");
	}

	@Override
	public void performTask() {
		System.out.println("Calucalate by computer!");
	}
	
	public void print(String str){
		System.out.println(str);
	}

}
