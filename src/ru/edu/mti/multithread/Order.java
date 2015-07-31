package ru.edu.mti.multithread;

public class Order {

	private volatile int order;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
