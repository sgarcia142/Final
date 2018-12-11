package Generics2;

public class Driver {
	public static void main(String[] args) {
		GenericArrays<Integer> r = new GenericArrays<Integer>();
		Integer[] array = {1,2,3,4,5,6};
		System.out.println(r.randomElement(array));
		
		GenericArrays<String> s = new GenericArrays<String>();
		String[] array2 = {"This is", "a string", "array"};
		System.out.println(s.randomElement(array2));
	}

}