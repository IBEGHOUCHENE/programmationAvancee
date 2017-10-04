package fr.miage.m1.reflection.solution;

public class RTTI {

	public class Personne {
		public Personne() {}
	}
	
	public class Prof extends Personne {
		public Prof() {}
	}
	
	public static void main(String[] args) {
		RTTI r = new RTTI();
		Personne p = r.new Personne();
		Personne p2 = r.new Prof();
		
		Class clp = p.getClass();
		Class clp2 = p2.getClass();
		System.out.println(clp.getName());
		System.out.println(clp2.getName());
		System.out.println(int.class);
	}
	
}
