package Generics3;

public class Driver {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello"));
		stringBox.add(new String("Bow ties are cool."));
		// print 10
		System.out.printf("This will be an integer: %d\n", integerBox.getFirst());
		// print Bow ties are cool
		System.out.printf("But this is a string!: %s\n", stringBox.getLast());		

	}
}
