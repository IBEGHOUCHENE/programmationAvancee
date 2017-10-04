package fr.miage.m1.lambda.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Motivation {
	private Random r = new Random();

	public void trierInteger() {
		ArrayList<Integer> a = new ArrayList<>(50);
		for (int i = 0; i < 50; i++) {
			a.add(new Integer(r.nextInt(10000)));
		}
		System.out.println("Lambda.tierTableau() avant : " + a);
		Collections.sort(a);
		System.out.println("Lambda.tierTableau() apres : " + a);
	}

	private class Personne {
		int age;

		public Personne(int age) {
			super();
			this.age = age;
		}

		@Override
		public String toString() {
			return "P :" + age;
		}
	}

	public void trierPersonnes() {
		ArrayList<Personne> a = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			a.add(new Personne(r.nextInt(10000)));
		}
		System.out.println("Motivation.trierPersonnes() avant : " + a);
		//ne marche pas parce qu'on ne sait pas comparer 2 personnes
		Collections.sort(a,new Comparator<Personne>() {
			@Override
			public int compare(Personne p1, Personne p2){
				    return p1.age - p2.age;
				  }
		});
		
		System.out.println("Motivation.trierPersonnes() apres : " + a);
		
	}

	public static void main(String[] args) {
		// x = (a,b) -> {return a+b}
		Motivation l = new Motivation();
//		l.trierInteger();
		l.trierPersonnes();
	}

}
