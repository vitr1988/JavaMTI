package ru.edu.mti.multithread;
import java.lang.Thread.State;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Order order = new Order();
		order.setOrder(1);
		
		Thread th = Thread.currentThread();
		State state = th.getState();
//		System.out.println(state);
		
		Thread th1 = new CustomThread(order);
		
		Thread th2 = new Thread(){
			@Override
			public void run(){
				System.out.println("CustomThread: second way of initializing thread!");
			}
		};
		
		
		Runnable th3 = new UserThread(order);
		
		th1.start();
		new Thread(th3).start();
		th2.start();
		
		System.out.println(order.getOrder());
	}

}
