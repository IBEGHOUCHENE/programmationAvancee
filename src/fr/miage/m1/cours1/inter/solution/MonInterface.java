package fr.miage.m1.cours1.inter.solution;

public interface MonInterface {
	
	public static void maMethodeStatic() {
		System.out.println("MonInterface.maMethodeStatic()");
	}
	
    public void bar();
    
    public default void toto() {
    		System.out.println("MonInterface.toto()");
    		
    }
    
}
