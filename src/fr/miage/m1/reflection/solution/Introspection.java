package fr.miage.m1.reflection.solution;

import java.lang.reflect.Field;

public class Introspection {
	public int a = 5;
	public float b = 10;

	public static void main(String[] args) {
		Introspection intro = new Introspection();
		Class c = Introspection.class;

		Field[] fl = c.getFields();
		for (Field f : fl) {
			try {
				System.out.println(f.getType() + "  " + f.getName() + " "
						+ f.get(intro));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
