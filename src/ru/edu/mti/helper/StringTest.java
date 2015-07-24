package ru.edu.mti.helper;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		String test = "test";
		String test2 = new String("test");
		
		String test3 = "Hello " + "World";
		test3 = new StringBuilder().append("Hello ").append("World").toString();
		
		System.out.println(test3.equalsIgnoreCase("heLLo woRLD"));
		
		System.out.println(test3 == "Hello World");
		System.out.println(test3.intern() == "Hello World");
		
		try {
			System.out.println(new String("Привет".getBytes("Cp1251"), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println(MessageFormat.format("Привет, {0} {1}", "YourLogin", 100));
		
		StringTokenizer str = new StringTokenizer("25, 16, 9, 4, 1, 0", ",");
		int[] array = new int[str.countTokens()];
		int i = 0;
		while(str.hasMoreTokens()){
			String digit = str.nextToken();
			array[i++] = Integer.decode(digit.trim());
		}
		System.out.println(Arrays.toString(array));
		
		String[] arrayStr = "25, 16, 9, 4, 1, 0".replaceAll("\\s+", "").split(",");
		System.out.println(Arrays.toString(arrayStr));
	}
}
