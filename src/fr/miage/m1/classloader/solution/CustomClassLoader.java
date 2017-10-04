package fr.miage.m1.classloader.solution;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassLoader extends URLClassLoader {

	public CustomClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		System.out.println("CustomClassLoader.findClass() " + name);
		return super.findClass(name);
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		System.out.println("CustomClassLoader.loadClass() " + name);
		return super.loadClass(name);
	}

	public static void main(String[] args) throws MalformedURLException,
			ClassNotFoundException {
		URL[] urls = new URL[] { new URL(
				"file:///Users/fhuet/Documents/workspaces/Miage/CustomClass/lib/custom.jar") };
		CustomClassLoader cl = new CustomClassLoader(urls,
				CustomClassLoader.class.getClassLoader());
		System.out.println("cl : " + cl + " \nhas parent : " + cl.getParent());
		Class c = cl.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class " + c + " has been loaded by "
				+ c.getClassLoader());

		Class c2 = cl.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class " + c + " has been loaded by "
				+ c.getClassLoader());
		System.out.println("Les deux classes sont identiques : " + c.equals(c2));

		System.out.println(" ---- 2eme class loader --------");
		CustomClassLoader cl2 = new CustomClassLoader(urls,
				CustomClassLoader.class.getClassLoader());
		Class c3 = cl2.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class " + c3 + " has been loaded by "
				+ c3.getClassLoader());

		System.out.println("Les deux classes sont identiques : " + c.equals(c3));

	}

}
