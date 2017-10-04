package fr.miage.m1.reflection.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke {

	public void foo() {
		System.out.println("Invoke.foo()");
	}
	
	public void bar(String s) {
		System.out.println("Invoke.bar() " + s);
	}
	
	public static void main(String[] args) {
		String nomClasse = "fr.miage.m1.reflection.solution.Invoke";
		try {
			Class c = Class.forName(nomClasse);
			System.out.println("Invoke.main() class " + c);
			
			Constructor ctor = c.getConstructor();
			 Object o2 = ctor.newInstance();
			 
			 System.out.println("Invoke.main() object " + o2);
			 
			Method m = c.getMethod("foo", new Class[] {});
			System.out.println(m);
			
			m.invoke(o2, new Object[] {});
			
			Method m2 = c.getMethod("bar", new Class[] {String.class});
			System.out.println(m2);
			m2.invoke(o2, new Object[] {"toto"});
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
