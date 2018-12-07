package Q8;

public class Driver {
	public static void main(String[] args) {
		Bag<Integer, Integer>bag1 = new Bag<Integer,Integer>();
		Bag<Integer, String>bag2 = new Bag<Integer,String>();
		Bag<String, Double>bag3 = new Bag<String, Double>();
		
		bag1.add(20, 92);
		bag2.add(20, "A-");
		bag3.add("B", 84.5);
		
		// Should print false 
		System.out.printf("Bag 1 is empty? %s \n", bag1.isEmpty());
		
		// Should print false
		System.out.printf("Found B in bag 2? %s \n", bag2.contains("B"));
		
		// Should print true
		System.out.printf("Found 84.5 is bag 3? %s \n", bag3.contains(84.5));
	}
}
