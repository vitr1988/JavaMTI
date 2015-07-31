package ru.edu.mti.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "red");
		map.put(27, "orange");
		map.put(3, "yellow");
		map.put(4, "green");
		map.put(5, "blue");
		map.put(6, "violet");
		
//		System.out.println(map.get(5));
//		
//		System.out.println(map.get(6));
//		
//		System.out.println(map.get(1));
		
		for (Entry<Integer, String> entry : map.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " - " + map.get(key));
		}
		
		Map<String, Integer> mapOfNumbers = new TreeMap<String, Integer>(
			new Comparator<String>(){
				@Override
				public int compare(String o1, String o2) {
					return -o1.compareTo(o2);
				}
			});
		mapOfNumbers.put("book", 1200);
		mapOfNumbers.put("magazine", 100);
		
		System.out.println(mapOfNumbers);
	}

}
