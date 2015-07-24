package ru.edu.mti.oop.enumeration;

public class Light {

	Color color = Color.BLUE;
	
	public void print(){
		System.out.println(color.getColor());
	}
	
	public static void main(String[] args) {
		Light ligth = new Light();
		ligth.print();
		
		switch(ligth.color){
			case BLACK : {break;}
			case BLUE : {break;}
			case GREEN : {break;}
			case YELLOW : {break;}
			case RED:
			default : {break;}
		}
	}
}
