package fr.miage.m1.lambda.solution;

public class Scoping {

	public int myField = 5; 
	public InterfaceCalcul ic = null;
	
	public static void main(String[] args) {
		//Lambda comme interface fonctionnelle
		InterfaceFonctionnelle e = (x) ->{System.out.println(x);};
		e.test(10);
		
		//Utilisation de variables locales
		int i = 5;
		InterfaceFonctionnelle e2 = (x) ->{System.out.println(x+i);};
		e2.test(10);
		//erreur
//		i=6;
//		e2.test(10);
		
		Scoping s = new Scoping();
		InterfaceFonctionnelle e3 = (x) ->{System.out.println(x+s.myField);};
        e3.test(15);
		
        //Calcul de n!
		s.ic = (x) -> {
			String c = null;
			c.length();
			if (x>1) {
				return x*s.ic.calc(x-1);
			} else {
				return x;
			}
		};
		
		System.out.println(s.ic.calc(4));
		
		
	}
	
}
