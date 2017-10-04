package fr.miage.m1.generics.solution;

public class Heritage<K> {

	public void foo(K k) {
	}

	
	public class SubHeritage<K> extends Heritage<K> {}
	
	
	public static void main(String[] args) {
		Heritage<Double> hd = new Heritage<>();
		hd.foo(10.1);
		// erreur
		hd.foo(1);
		
		Heritage<Number> hn = new Heritage<>();
		hn.foo(10.1);
		hn.foo(1);
	
	    Heritage<Integer> hi = new Heritage<>();
	    
	    //Erreur
	    hn=hi;
		
		
	}

}
