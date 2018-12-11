package Generics;

public class Driver {
	public static void main(String[] args) {
		Saver<Integer> saver1 = new Saver<Integer>(13);
		System.out.println(saver1.save(42));
		System.out.println(saver1.save(-999));
		System.out.println(saver1.save(2013));
		
		Saver<String> saver2 = new Saver<String>("foo");
		System.out.println(saver2.save("bar"));
		System.out.println(saver2.save("why"));
		System.out.println(saver2.save("yar"));
	}
}
