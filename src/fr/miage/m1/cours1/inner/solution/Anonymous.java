package fr.miage.m1.cours1.inner.solution;

public class Anonymous {

	public interface Inter {
		public void foo();
	}
	
	public void go() {		
		Inter t = new Inter() {
			@Override
			public void foo() {
					
			}		
		};
	}	
}
