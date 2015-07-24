package ru.edu.mti.oop;

public class WorldTree {

	int heigth;
	int countOfbranches;
	String name;
	
	public static final double PI = 3.14;
	
	WorldTree(){
	}
	
	WorldTree(int h, int count, String treeName){
		this.heigth = h;
		countOfbranches = count;
		name = treeName;
	}
	
	WorldTree(int h, String treeName){
		this(h, 1, treeName);
	}
	
	public void setHeight(int heigth){
		this.heigth = heigth;
		if (heigth >= 100){
//			this.countOfbranches = 10;
			this.setCount(10);
		}
		
	}
	
	public void setHeight(WorldTree anotherTree){
		this.setHeight(anotherTree.heigth);
	}
	
	public void setCount(int count){
		this.countOfbranches = count;
	}
	
	
	public static void printPI(){
		System.out.println(PI);
	}
}
