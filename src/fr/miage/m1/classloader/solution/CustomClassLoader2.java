package fr.miage.m1.classloader.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomClassLoader2 extends ClassLoader {

	//load class from fixed directory
	 public Class findClass(String name) {
		Path file = Paths.get("/Users/fhuet/Documents/workspaces/Miage/CustomClass/bin/fr/miage/custom/MyCustomInt.class");
		 try {
			byte[] bytecode = Files.readAllBytes(file);
			 return defineClass(name,bytecode,0,bytecode.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
       return null;
     }
	
	public static void main(String[] args) throws ClassNotFoundException {
		CustomClassLoader2 cl2 = new CustomClassLoader2();
		Class c = cl2.loadClass("fr.miage.custom.MyCustomInt");
		System.out.println("Class loaded " + c);
	}
	
}
