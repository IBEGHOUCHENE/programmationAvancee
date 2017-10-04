package fr.miage.m1.generics.solution;

import java.util.List;

public class WildCards {

	public static void process(List<? extends Number> list) { /* ... */ }	
	
//	public static <K> void process2(List<K extends Number> list) {}
	
	public static void process2(List<? extends WildCards> list) {
	   
	}
	
	public static <K extends WildCards> void process3(List<K> list) {
		   
	}
	
}
