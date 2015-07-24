package ru.edu.mti.oop;

public class ClientManager implements Manager {

	@Override
	public void communicate() {
		print("Communication with clients");
	}

	@Override
	public void performTask() {
		print("Perform Task by hands");
	}

	public void print(String str){
		System.out.println(str);
	}
}
