package fr.miage.m1.generics.solution;

import java.io.Serializable;

public class MyRestrictedType<K extends Number & Serializable> {

	public K v; 
	
	public void foo() {
		//Montrer qu'on a acces aux methodes de Number
	}
	
	public <V extends Number> void foo2(V v) {
		
	}
		
	public static void main(String[] args) {
		MyRestrictedType<Integer> i = new MyRestrictedType<>();
		//Erreur de compilation
		MyRestrictedType<String>i2 = new MyRestrictedType<>();
	}
	
}
