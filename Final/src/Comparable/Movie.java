package Comparable;

public class Movie implements Comparable<Movie>{
	
	private double rating; 
	private String name;
	private int year;

	public int compareTo(Movie m) {
		return this.year - m.year;
	}
	
	public Movie(String nm, double rt, int year) {
		this.name = nm;
		this.rating = rt;
		this.year = year;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + " " + this.year + " " + this.rating;
	}
}
