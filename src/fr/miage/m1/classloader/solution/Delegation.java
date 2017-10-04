package fr.miage.m1.classloader.solution;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Delegation {

	public class CustomCL extends URLClassLoader {
		
		private int rank;
		
		
		public CustomCL(URL[] urls) {
			super(urls);
		}
		
		public CustomCL(URL[] urls, ClassLoader parent) {
			super(urls, parent);
		}
		
		public void setRank(int i) {
			this.rank = i;
		}		
	}
	
	
	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
		Delegation d = new Delegation();
		URL[] urls = new URL[] { new URL(
				"file:///Users/fhuet/Documents/workspaces/Miage/CustomClass/lib/custom.jar") };
		CustomCL cl = d.new CustomCL(urls);
		Class c = cl.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class " + c + " has been loaded by "
				+ c.getClassLoader());
        System.out.println("-------------------");
		
        
        CustomCL cl2 = d.new CustomCL(new URL[] {}, cl);
        Class c2 = cl2.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class " + c2 + " has been loaded by "
				+ c2.getClassLoader());
        
	}
	
	
	
	
	
}
