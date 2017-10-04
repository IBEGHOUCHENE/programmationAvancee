package fr.miage.m1.cours1.inter.solution;

public class ClasseMere implements MonInterface, MonInterface2 {
	
	public void foo() {
		System.out.println("ClasseMere.foo()");
	}

	@Override
	public void bar() {
		System.out.println("ClasseMere.bar()");
		
	}

	@Override
	public int titi() {
		System.out.println("ClasseMere.titi()");
		return 0;
	}
	
	private void privee () {
		System.out.println("ClasseMere.privee()");
	}
	

}
