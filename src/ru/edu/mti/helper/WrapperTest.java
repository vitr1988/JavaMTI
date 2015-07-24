package ru.edu.mti.helper;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperTest {

	public static void main(String[] args) {
		boolean flag = true;
		Boolean flag2 = null;
//		flag2.booleanValue();
		
		Integer ind = 0;
		Integer index = null; new Integer(1);
		int i;
		try {
			i = index;
		}
		catch(NullPointerException e){
			i = 0;
		}
		if (Integer.valueOf(1).equals(index)){
			System.out.println("Test");
		}
		Character c = 'c';
		Float f = 0.1f;
		
		Integer a = 129;
		Integer b = 129;
		System.out.println(a == b);// помните!
		System.out.println(a.equals(b));
		
		BigInteger big = new BigInteger("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		BigInteger big2 = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		
		System.out.println(big.multiply(big2));
		
		BigDecimal decimal = new BigDecimal("11111111111111111111111111111111111111111.11111111111111111111111111111111111111111111111");
		BigDecimal decimal2 = new BigDecimal("11111111111111111111111111111111111111111.11111111111111111111111111111111111111111111111");
		System.out.println(decimal.divide(decimal2));
		
		System.out.println(new BigDecimal(1.36));
		System.out.println(new BigDecimal("1.36"));
		
	}
}
