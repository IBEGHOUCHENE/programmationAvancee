package fr.miage.m1.generics.solution;

public class Exemple<T> {
	
	T truc;
	
	public Exemple() {}

	public void setTruc(T t) {
		this.truc = t;
	}

	public T getTruc() {
		return truc;
	}	
	
	
	public static void main(String[] args) {
		Exemple<String> s = new Exemple<String>();
		
		Exemple<Integer> s2 = new Exemple<>();
		
	//	Exemple<> s3 = new Exemple<Double>();
	}
}
