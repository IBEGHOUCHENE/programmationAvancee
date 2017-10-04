package fr.miage.m1.lambda.solution;

public class ExampleIF{

	public ExampleIF() {
	}
	
	public void test(InterfaceFonctionnelle e) {
		e.test(1);
	}
	
	public void test2(InterfaceFonctionnelle2 e){
		e.noParam();
	}
	
	
	public static void main(String[] args) {
		ExampleIF eif = new ExampleIF();
		eif.test((x)->System.out.println(x));	
	   
		eif.test2(() ->System.out.println("xxx"));
	
	}
	
}
