package fr.miage.m1.cours1.parametre;

public class Test {

	
	public void swap(int a, int b) {
		int tmp = b;
		b = a;
		a = tmp;
	}
	
	public void swap2(Integer a, Integer b) {
		Integer tmp = b;
		b = a;
		a = tmp;
	}
	
	public void swap3(MyInt a, MyInt b) {
		MyInt tmp = b;
		b = a;
		a = tmp;
	}
	
	public void swap4(MyInt a, MyInt b) {
		int tmp = b.getI();
		b.setI(a.getI());
		a.setI(tmp);
	}
	
	
	
	public static void main(String[] args) {
		Test t = new Test();
		int x = 10;
		int y =  50;
		t.swap(x, y);
		System.out.println("Swap 1 x = " + x +", y= " +y);
		
		Integer ix = new Integer(10);
		Integer iy = new Integer(50);
		t.swap2(ix, iy);
		System.out.println("Swap 2 ix = " + ix +", iy= " +iy);
		
		MyInt mix = new MyInt(10);
		MyInt miy = new MyInt(50);
		t.swap3(mix, miy);
		System.out.println("Swap 3 mix = " + mix +", miy= " +miy);
		
		t.swap4(mix, miy);
		System.out.println("Swap 4 mix = " + mix +", miy= " +miy);
		
	}
	
	
}
