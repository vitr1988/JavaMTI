package ru.edu.mti.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

public class URLTest {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://mti.edu.ru");
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("data", "data");
			connection.setDoOutput(true);
			connection.setConnectTimeout(3000);
//			FileWriter writer = new FileWriter("clone.html");
			connection.connect();
			
//			BufferedReader reader = new BufferedReader(
//					new InputStreamReader(connection.getInputStream()));
			System.out.println(connection.getHeaderFields().values());
//			for (Iterator<String> iter = reader.lines().iterator(); iter.hasNext();){
//				writer.write(iter.next());
//			}
//			
			
			
//			reader.close();
//			writer.close();
			System.out.println("Done!");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
