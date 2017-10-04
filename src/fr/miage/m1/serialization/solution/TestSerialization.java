package fr.miage.m1.serialization.solution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization implements Serializable {
	
	private int test;
	
	public TestSerialization() {}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestSerialization ts = new TestSerialization();
	
		//Ecriture d'un objet
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(ts);
		//Lecture de l'objet
		ByteArrayInputStream bi = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream is = new ObjectInputStream(bi);
		TestSerialization ts2 = (TestSerialization) is.readObject();
		
		System.out.println("Objets are identical : " + (ts==ts2));
	}

}
