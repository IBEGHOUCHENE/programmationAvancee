package fr.miage.m1.generics.solution;

public class Exemple2<T,U> {

	T toto;
	U titi;
	
	
	public Exemple2(T t, U u) {}
	
	public static void main(String[] args) {
		Exemple2<String, Integer> e = new Exemple2<>("Test",10);
		Exemple2<String, Exemple2<String, Integer>> e2 = new Exemple2<>("Test",e);
	}
}
