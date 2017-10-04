package fr.miage.m1.cours1.inter.solution;

public class ClasseFille extends ClasseMere {

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		super.foo();
	}
	
	void rien() {
		System.out.println("ClasseFille.protegee()");
	}
	
	protected void protegee() {
		System.out.println("ClasseFille.protegee()");
	}
	
	private void privee() {
		System.out.println("ClasseFille.privee()");
	}

	public static void main(String[] args) {
		ClasseFille f = new ClasseFille();
		f.foo();
		f.titi();
		f.toto();
		MonInterface.maMethodeStatic();
		
		f.privee();
	}
	
	
	
}
