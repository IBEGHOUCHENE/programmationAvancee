package fr.miage.m1.generics.solution;

import java.util.ArrayList;

public class Generics {

	public void sansGenerics() {
		ArrayList al = new ArrayList();
		al.add("xxx");
		String s = (String) al.get(0);
	}
	
	public void avecGenerics() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Test");
		//al.add(5); ERREUR
		String s= al.get(0);
	}
	
	
}
