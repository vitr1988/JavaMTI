package ru.edu.mti.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(123);
		set.add(2);
		set.add(124);
		
		for (int i = 0 ; i < 100; i++){
			set.add(i);
		}
//		System.out.println(set);
		
		SortedSet<Integer> numberSet = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		for (int i = 0 ; i < 100; i++){
			numberSet.add(i);
		}
		
		System.out.println(numberSet);
		
	}

}
