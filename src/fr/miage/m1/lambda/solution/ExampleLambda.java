package fr.miage.m1.lambda.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ExampleLambda {
	Random r = new Random();

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
//		Collections.sort(a,(Personne p1, Personne p2) -> (p1.age-p2.age));
//		Collections.sort(a, ( p1,  p2) ->  {return p1.age-p2.age;});
		Collections.sort(a, ( p1,  p2) -> p1.age-p2.age);
		System.out.println("Motivation.trierPersonnes() apres : " + a);
	
	}

	public static void main(String[] args) {
		ExampleLambda l = new ExampleLambda();
		l.trierPersonnes();

	}

}
