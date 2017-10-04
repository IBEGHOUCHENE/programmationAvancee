package fr.miage.m1.cours1;

import java.util.ArrayList;
import java.util.Iterator;

public class Fille extends SuperClasse implements MonInterface{

	@Override
	public void toto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int titi() {
		// TODO Auto-generated method stub
		System.out.println("ok2 ");
		this.machin();
		return 0;
	}
	protected void protege() {
		
	}
	
	private void machin() {
		
	}
	
	class Copain {
		public Copain() {
			
		}
	}
	
	public static void main(String[] args) {
		Fille f = new Fille();
		Fille.Copain c = f.new Copain();
		System.out.println(c);
	}

}
