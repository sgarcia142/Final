package Generics2;

import java.util.Random;

public class GenericArrays<T> {
	public T randomElement(T[] arry) {
		Random random = new Random();
		int i = random.nextInt(arry.length);
		return arry[i];
	}
}
