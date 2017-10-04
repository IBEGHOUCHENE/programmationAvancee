package fr.miage.m1.cours1.inner;

public class AnonymousInner {

	public interface Inter {
		 public void toto();
	}
	
	class Truc1 implements Inter {
		public void toto() {
		
		}
	}
	
	public static void main(String[] args) {
		
		Inter i = new Inter() {
			@Override
			public void toto() {
			}		
		};
		
	}

}
