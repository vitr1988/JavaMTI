package ru.edu.mti.helper;

public class Chain {

	String field;
	
	public static void main(String[] args) {
		Chain chain = new Chain();
		chain.setField("example1")
			.setField("example2")
			.setField("example3");
		System.out.println(chain.field);
	}
	
	public Chain setField(String str){
		this.field = str;
		return this;
	}

}
