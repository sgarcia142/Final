package Generics3;

import java.util.ArrayList;

public class Box<T> {
	private ArrayList<T> objVals = new ArrayList<T>();
	
	public void add(T objVal) {
		this.objVals.add(objVal);
	}
	
	public T getFirst() {
		return this.objVals.get(0);
	}
	
	public T getLast() {
		return this.objVals.get(this.objVals.size()-1);
	}
}
