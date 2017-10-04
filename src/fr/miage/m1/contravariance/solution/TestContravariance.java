package fr.miage.m1.contravariance.solution;

public class TestContravariance {

	public TestContravariance() {
	}
	
    public void foo(String c) {
    	System.out.println("Test.foo(String)");
    }
    
    public void foo(Object c) {
    	System.out.println("Test.foo(Object)");
    }

    
    
    public static void main(String[] args) {
		TestContravariance t = new TestContravariance();
		t.foo("");
		Object o = "";
		t.foo(o);
	}
    
	
	
}
