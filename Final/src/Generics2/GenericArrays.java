package Generics2;

public class GenericArrays<T> {
	public T randomElement(T[] arry) {
		int i = (int) (Math.random() * arry.length);
		return arry[i];
	}
}
