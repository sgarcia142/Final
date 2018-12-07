package Q8;

public class Bag<S,T> {
	private S s; 
	private T t;
	
	public void add(S s, T t) {
		this.s = s;
		this.t = t;
	}
	
	public boolean contains(T t) {
		if(t.equals(this.t))
			return true;
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if(this.s == null && this.t == null) 
			return true;
		else
			return false;
	}
}
