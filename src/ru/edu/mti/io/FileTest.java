package ru.edu.mti.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("src");
		System.out.println("Is folder ?" + file.isDirectory());
		System.out.println("Does folder exist ?" + file.exists());
		System.out.println("Is Readable ?" + file.canRead());
		System.out.println("Is Writable ?" + file.canWrite());
		if (!file.exists()) file.mkdirs();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getTotalSpace());
		
	}

}
