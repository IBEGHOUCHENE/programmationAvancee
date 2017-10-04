package fr.miage.m1.reflection.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class New {

	public New() {
		System.out.println("New()");
	}
	
	public New(String s) {
		System.out.println("New.New() " + s);
	}
	
	
	public static void main(String[] args) {
		String nomClasse = "fr.miage.m1.reflection.New";
		try {
			Class cl = Class.forName(nomClasse);
			Object o = cl.newInstance();

			Constructor ctor = cl.getConstructor(String.class);
			 Object o2 = ctor.newInstance("Test");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
