package ru.edu.mti.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		List list = new ArrayList(4);
		list.add(1);
		list.add("Hello");
		list.add(Boolean.TRUE);
		list.add(new float[]{1.f, 2.f, 3.f});
		for (int i = 0; i < list.size(); i++){
			Object element = list.get(i);
//			System.out.println(
//				element instanceof float[] ?
//					Arrays.toString((float[]) element) : element);
		}
		list.add(6.);
//		System.out.println(list.size());
		list.remove("Hello");
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Hello1");
		list2.add("Hello2");
		list2.add("Hello3");
		
//		for (int index = 0; index < list2.size(); index++){
//			if (index % 2 == 1){
//				list2.remove(list2.get(index));
//			}
//		}
		System.out.println("--------");
		int index = 1;
		for (ListIterator<String> iter = list2.listIterator(2); iter.hasPrevious(); index++){
			System.out.println(iter.previous());
		}
		
//		for (Iterator<String> iter = list2.iterator(); iter.hasNext(); index++){
//			String elem = iter.next();
//			if (index % 2 == 1){
//				iter.remove();
//			}
//		}
//		System.out.println(list2);
		
		
		
//		List<Integer> intList = (List) list2; // так делать не надо!
//		
//		for (Integer elem : intList){
//			System.out.println(elem);
//		}
	}

}
