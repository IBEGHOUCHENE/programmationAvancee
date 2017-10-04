package fr.miage.m1.classloader.solution;

public class GetClassLoader {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("GetClassLoader loaded by : "
				+ GetClassLoader.class.getClassLoader());
		
		System.out.println("String loaded by : "
				+ String.class.getClassLoader());

		
		System.out.println("Class loaded by : " + Class.class.getClassLoader());
		
		Class m2 =  GetClassLoader.class.getClassLoader().loadClass("com.sun.nio.zipfs.ZipCoder");
		System.out.println("ZipCoderZipCoder loaded by : " +m2.getClassLoader());
		
	}

}
