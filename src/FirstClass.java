import java.util.Arrays;

public class FirstClass {

	public static final int MAX = 1000;
	/**
	 * Запускаемый метод, с которого начинается работа
	 * всего приложения
	 * 
	 * @param args		входной параметр нашей программы
	 */
	public static void main(String[] args) {
		// пример цикла в языке Java
		for (int i = 0, k = 1; i < args.length; i++, k--){
			if (i % 2 == 0){
				continue;
			}
			String argument = args[i];
			/* Пример многострочного комментария
			 * действительно так!
			 * */
			System.out.println(argument);
		}
		// то же самое
		for (String argument : args){
			System.out.println(argument);
		}
		
		int a = 50000; // 10я СС
		int b = 0b111; // двоичная СС
		int c = 0x123F; // 16я СС
		int d = 0123; // 8я СС
		
		double num = 2.5;
		double num2 = 2.5e3; // 2500
		
		char symbol = '1';
		char eol = '\n';
		char unic = '\u0416';
		
		java.lang.String str = "Здесь могла бы быть Ваша реклама!";
		String exampleStr = "Начало строки\n" +
				"Конец строки"; //Начало строкиКонец строки
		String пример = "Example"; // почему бы и нет?
		int aIndex = 1;
		//int 2e3 = 100;
		
		boolean flag = true; // или false
		
		byte bit = 125; // -128..127
		// 2 в степени 8
		
		short sh = 5435; // 16битный 
		int index = 5435; // 32битный 
		long longIndex = 5435; // 64битный 
		char ch = 'k'; // 16 бит 0..65535 \u0000 - \uFFFF
		
		byte b1 = 25 + 13; //38
		byte b2 = 25 - 13;//12
		byte b3 = 2 * 13; //26
		byte b4 = 25 / 13; //1
		byte b5 = 25 % 13; //12
		b2++;//13
		b1--;//39
		double num4 = 5./2.; //2.5
		
		short result = (short) (b1 + b2);
		
		boolean comp = 5 > 3; //true 5 < 3 5 == 3 5 != 3 5 >= 3 5 <= 3 
		// x < y < z 				x < y && y < z
		
		// 2 << 3 125 >> 2 
		
		b1 += b2; // b1 = (тип)( b1 + b2 )    -=   /= *=
		
		int myVariable = b1 > b2 ? 25 : -25;
		// x > 0 ? x : -x
		int index2 = (b1 + b2) + (sh + b5);
		++b2;//13
		--b1;//39
		// b2 = 10 b5 = 3
		int sum = (b2++ +  b5); //13
		int sum2 = (++b2 + b5); //15 = 12 + 3
		
		
		if (index == longIndex) {
			System.out.println("index is really same longIndex");
			int index23 = 1;
		}
		else if (index > longIndex) {
			System.out.println("index is more than longIndex");
		}
		else if (index < longIndex)
			System.out.println("index is less than  longIndex");
		else 
			System.out.println("Сюда не попадем!");
		
		while (sum != 0){
			System.out.println("summa is " + sum); // "summa is " + "13" == "summa is 13"
			sum--;
		}
		
		M : {
			int number = 7;
			do {
				System.out.println("Hello World!");
				number--;
				if (number == 5){
					break M;
				}
			}
			while (true);
		
			//..
		}
		System.out.println("Transferred from break operator");
		
		switch(sum){
			case 13 : {
				System.out.println(sum);
				break;
			}
			case 15 :
			case 10 : {
				sum -= 5;
				break;
			}
			case 0 : {
				System.out.println("It can cause exception!");
				break;
			}
			case 11 :
			default : {
				System.out.println("We are here!");
				break;
			}
		}
		
		int[] indexes;
		
		indexes = new int[5];
		// int[] indexes = new int[5];
		System.out.println(Arrays.toString(indexes));
		
		indexes[0] = 1;
		indexes[1] = 2;
		indexes[2] = 3;
		indexes[3] = 4;
		indexes[4] = 5;
		
		System.out.println(Arrays.toString(indexes));
		
		for (int i = 0; i < indexes.length; i++){
			indexes[i] = indexes[i] * 5;
		}
		
		System.out.println(Arrays.toString(indexes));
		
		int[] indexes2 = new int[]{1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(indexes2));
		
		double[][] quadraticArray = new double[3][];
		quadraticArray[0] = new double[]{0, 1, 2, 3};
		quadraticArray[1] = new double[]{4, 5};
		quadraticArray[2] = new double[]{};
		
		for (double[] arr: quadraticArray){
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
