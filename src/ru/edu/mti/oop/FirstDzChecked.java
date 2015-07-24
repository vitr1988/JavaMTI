package ru.edu.mti.oop;

import java.util.Scanner; // import class to input data

public class FirstDzChecked {

	public static void main(String[] args) {

		int x = 0; // created variables for displaying results
		double x1 = 0; // лучше использовать тип double для результата
		double x2 = 0; // лучше использовать тип double для результата
		//TODO: отлично что разобрались, но можно было использовать привычный args
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number a:"); // ask user to enter "a"

		int a = in.nextInt();// read an integer for "a"

		if (a == 0) {
			System.out.println("a can't be 0, please enter another number:");
			a = in.nextInt();
		}

		System.out.println("Enter number b:"); // ask user to enter "b"
		int b = in.nextInt();
		System.out.println("Enter number c:"); // ask user to enter "c"
		int c = in.nextInt();

		int d = b * b - 4 * a * c;
		System.out.println("d = " + d);

		if (d < 0) {
			System.out.println("This equation doesn't have a solution.");
		}

		else if (d == 0) {
			x = -b / 2 * a; // calculating result
			System.out.println("x = " + x); // displaying result
		}

		else if (d > 0) {
			double y = Math.sqrt(d);
			// лучше использовать тип double для результата
			x1 = (-b + y) / 2 * a; // calculating result 1
			x2 = (-b - y) / 2 * a; // calculating result 2
			System.out.println("x1 = " + x1); // displaying result 1
			System.out.println("x2 = " + x2); // displaying result 1
		}
	}

}
