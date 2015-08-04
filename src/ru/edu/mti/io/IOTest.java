package ru.edu.mti.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

public class IOTest {

	public static void main(String[] args) {
		
		PrintStream stream = System.out;
//		stream.print("Строка тест1");
//		stream.println("Строка тест2");
		
		try {
//			FileWriter fw = new FileWriter("test.txt");
//			fw.write("Строка тест1");
//			fw.write("Строка тест2");
//			fw.flush();
//			fw.close();
//			
//			FileWriter fw2 = new FileWriter("test.txt", true);
//			fw2.write("Строка тест3");
//			fw2.write("Строка тест4");
//			fw2.flush();
//			fw2.close();
			
			
			FileReader reader = new FileReader("test.txt");
//			int in;
//			int i = 0;
//			char[] buffer = new char[1024];
////			while ((in = reader.read()) != -1){
////				buffer[i++] = (char) in;
////			}
//			for (int c = reader.read(); c != -1; ){
//				buffer[i++] = (char) c;
//				c = reader.read();
//			}
//			System.out.println(new String(buffer));
			
			BufferedReader reader2 = new BufferedReader(reader);
			Iterator<String> iter =  reader2.lines().iterator();
			for (; iter.hasNext();){
				System.out.println(iter.next());
			}
			reader2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
