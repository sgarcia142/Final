package Generics;

public class Saver<T> {
	private T savedValue;
	
	public Saver(T objVal) {
		this.savedValue = objVal;
	}
	
	public T save(T objVal){
		T currentVal = this.savedValue;
		this.savedValue = objVal;
		return currentVal;
	}
}
