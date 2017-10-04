package fr.miage.m1.classloader.solution;

public class LoadClass {

	public static void main(String[] args) {
		ClassLoader cl = LoadClass.class.getClassLoader();
		System.out.println("ClassLoader = " + cl);
		try {
			Class mc = cl.loadClass("fr.miage.m1.classloader.solution.MyInt");
			System.out.println(mc);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
