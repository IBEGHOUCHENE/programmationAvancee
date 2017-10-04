package fr.miage.m1.cours1.inter.solution;

public class Introduction implements Interface1 {
 
	public static void main(String[] args) {
		Introduction it = new Introduction();
		it.foo();
		
	}

	@Override
	public void foo() {
		System.out.println("Introduction.foo() ");
		
	}
	
}
