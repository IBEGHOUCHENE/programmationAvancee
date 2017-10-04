package fr.miage.m1.cours1;

public class Parametre {

	public static void  modifi(int a, int b) {
		a = 10;
		b = 12;
	}
	public static void  modifi(MonEntier a, MonEntier b) {
		a.setX(10);
		b.setX(12);
		MonInterface f = new MonInterface() {
			
			@Override
			public void toto() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int titi() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println("f =======> " + f);
	}
	
	
	public static void modifiTab(int[] x) {
		x[0] = 10;
		x[1] = 12;
	}
	
	public static void main(String[] args) {
		int x= 0;
		int y = 5;
		//modifi(x,y);
		int[] tab = new int[] {x,y};
		modifiTab(tab);
//		System.out.println("x=" + tab[0]);
//		System.out.println("y=" + tab[1]);
//		
		MonEntier i1 = new MonEntier();
		i1.setX(0);
		MonEntier i2 = new MonEntier();
		i2.setX(5);
		
		modifi(i1,i2);
		System.out.println(i1);
		System.out.println(i2);
		
	}
	
	
}
