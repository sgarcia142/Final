package Comparable;
import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		movies.add(new Movie("Force Awakens", 8.3, 2015));
		movies.add(new Movie("Star Wars", 8.7, 1977));
		movies.add(new Movie("Empire Strikes Back",8.8,1980 ));
		movies.add(new Movie("Return of the Jedi",8.4,1983));
		
		displayList(movies);
		
		Collections.sort(movies);
		
		displayList(movies);
		
		dogs.add(new Dog("Moosey", 10, 22.5));
		dogs.add(new Dog("Percy", 2, 12));
		dogs.add(new Dog("Sugar", 11, 65));
		dogs.add(new Dog("Rocky", 10, 55));
		
		displayList(dogs);
		
		// Sort the movies by rating
		RatingCompare rp = new RatingCompare();
		Collections.sort(movies, rp);
		
		displayList(movies);
	}
	
	public static <T> void displayList(ArrayList<T> list) {
		for(T t: list) {
			System.out.println(t.toString());
		}
	}
}
