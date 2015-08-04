package ru.edu.mti.multithread;
import java.lang.Thread.State;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		Order order = new Order();
		order.setOrder(1);
		
		Thread th = Thread.currentThread();
		
		State state = th.getState();
//		System.out.println(state);
		
		ThreadGroup group = new ThreadGroup("group1");
		group.setMaxPriority(6);
		Thread th1 = new CustomThread(group, order);
		th1.setPriority(7);
		th1.setDaemon(true);
		Thread th2 = new Thread(group, "thread2"){
			@Override
			public void run(){
				System.out.println("CustomThread: second way of initializing thread!");
			}
		};
		
		
		Runnable th3 = new UserThread(order);
		
		try {
			th1.start();
			th1.join();
			Thread thread3 = new Thread(th3);
			thread3.start();
			thread3.join();
			th2.start();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(order.getOrder());
	}

	
	public void setRest(int amount){
		synchronized ("") {
			
		}
//		sysout
		//
	//		deposit.setAmount(amount);
		
	}
}
