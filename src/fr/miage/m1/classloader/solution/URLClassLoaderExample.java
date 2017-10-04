package fr.miage.m1.classloader.solution;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderExample {

	public static void main(String[] args) {
		ClassLoader cl = URLClassLoaderExample.class.getClassLoader();
		try {
			cl.loadClass("fr.miage.custom.MyCustomInt");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Ca plante, maintenant on utilise un URL Class Loader
		try {
			URLClassLoader ucl = new URLClassLoader(
					new URL[] { new URL(
							"file:///Users/fhuet/Documents/workspaces/Miage/CustomClass/lib/custom.jar") });
		     Class c = ucl.loadClass("fr.miage.custom.MyCustomInt");
		     System.out.println(c);
		     Object o = c.newInstance();
		     System.out.println(o);
		     
		     ClassLoader clp = c.getClassLoader().getParent();
		     System.out.println("Le classLoader parent est " + clp);
		     //mais la classe n'existe pas dans le parent
		     clp.loadClass("fr.miage.custom.MyCustomInt");
		     
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
