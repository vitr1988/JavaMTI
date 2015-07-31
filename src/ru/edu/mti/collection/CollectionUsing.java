package ru.edu.mti.collection;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class CollectionUsing {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		Collections.
//		Arrays.
		Locale.getDefault();
		
//		System.out.println(System.currentTimeMillis());
		
		Date date = new Date();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Date date2 = new Date(System.currentTimeMillis());
		date.before(date2);
		date.after(date2);
		
		date2.setDate(1);
		date2.setMonth(8);
		System.out.println(date2.getYear());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
		cal.set(Calendar.YEAR, 2020);
		
		LocalDate date3 = LocalDate.of(2020, 9, 1); // 1st September 2020
//		date3.format(DateTimeFormatterBuilder.getLocalizedDateTimePattern(dateStyle, timeStyle, chrono, locale))
		DateFormat dateFOrmat = new SimpleDateFormat("MM/dd/yyyy");
		try {
			System.out.println(dateFOrmat.parse("11/11/2011").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(dateFOrmat.format(cal.getTime()));
		
		System.out.println(cal.getTime().getTime());
		
//		System.out.println(date.getTime()); //System.currentTimeMillis()
//		
//		System.out.println(date.compareTo(date2));
		
		long end = System.currentTimeMillis();
		
		System.out.println(Math.random() * 100);
		
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextDouble());
		
		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(end - start);
	}

}
