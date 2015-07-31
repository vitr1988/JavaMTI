package ru.edu.mti.multithread;

public class CustomThread extends Thread {

	Order ord;
	
	public CustomThread(Order order){
		this.ord = order;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.ord.setOrder(2);
		System.out.println(getState());
		System.out.println("CustomThread: first way of initializing thread!");
	}

	
}
