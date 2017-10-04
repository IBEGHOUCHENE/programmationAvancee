package fr.miage.m1.serialization.solution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerialization implements Serializable {

	 private int a = 10;
	
	 private void writeObject(java.io.ObjectOutputStream stream)
	            throws IOException {
		 System.out.println("CustomSerialization.writeObject()");
		 a=20;
		 stream.defaultWriteObject();
	 }
	 
	 private void readObject(java.io.ObjectInputStream stream)
	            throws IOException, ClassNotFoundException {
		 System.out.println("CustomSerialization.readObject()");
		  stream.defaultReadObject();
	 }
	
	 
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
		 CustomSerialization cs = new CustomSerialization();
		    //Ecriture d'un objet
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(cs);
			//Lecture de l'objet
			ByteArrayInputStream bi = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream is = new ObjectInputStream(bi);
			CustomSerialization cs2 = (CustomSerialization) is.readObject();
			System.out.println("Value of a : " + cs2.a);
	}
	 
	 
}
