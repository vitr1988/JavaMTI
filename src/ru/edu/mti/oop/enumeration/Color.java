package ru.edu.mti.oop.enumeration;

public enum Color {
	
	RED("red"), BLACK("black"), BLUE("blue"), YELLOW("yellow"), GREEN("green");
	
	Color(String str){
		colour = str;
	}
	
	String colour;
	
	public String getColor(){
		return colour;
	}
}
