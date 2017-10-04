package fr.miage.m1.cours1.inter.solution;

public interface Interface1 {
	public abstract void foo();

	public static void staticMethod() {
		System.out.println("Interface1.staticMethod()");
	}

	public default void defaultMethod() {
		System.out.println("Interface1.defaultMethod()");
	}

	public default void defaultMethod2() {
		System.out.println("Interface1.defaultMethod2()");
	}

}
