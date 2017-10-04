package fr.miage.m1.cours1.inter.solution;


public interface SubInterface1 extends Interface1 {
   void defaultMethod(); 
   
	public default void defaultMethod2() {
		System.out.println("SubInterface1.defaultMethod2()");
	}
}
