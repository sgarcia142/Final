package Comparable;


public class Dog implements Comparable<Dog> {

	private String name;
	private int age;
	private double weight;
	
	public Dog(String nm, int age, double weight) {
		this.name = nm;
		this.age = age;
		this.weight = weight;
	}
	
	public int compareTo(Dog d) {
		return this.age - d.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getDouble() {
		return this.weight;
	}
	
	public String toString() {
		return this.name + " " + this.age + " " + this.weight;
	}
	
}
