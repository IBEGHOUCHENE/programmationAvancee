package fr.miage.m1.serialization.solution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializationDisk implements Serializable{

	private int a;
	public String b;

	public TestSerializationDisk() {
		this.a = 10;
		this.b = "toto";
	}

	public static void saveToDisk(String path, TestSerializationDisk tsd) throws FileNotFoundException, IOException {
		// Ecriture d'un objet
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
		oos.writeObject(tsd);
	}

	public static TestSerializationDisk loadFromDisk(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		    ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File(path)));
	     	return (TestSerializationDisk) is.readObject();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		TestSerializationDisk tsd = new TestSerializationDisk();
//		TestSerializationDisk.saveToDisk("test.save", tsd);
		TestSerializationDisk tsd2 = TestSerializationDisk.loadFromDisk("test.save");
		System.out.println(tsd2.b);
	}

}
