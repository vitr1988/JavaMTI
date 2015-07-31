package ru.edu.mti.multithread;

public class UserThread implements Runnable {

	Order ord;
	
	public UserThread(Order order){
		this.ord = order;
	}
	@Override
	public void run() {
		ord.setOrder(3);
		System.out.println("CustomThread: third way of initializing thread!");
	}

}
