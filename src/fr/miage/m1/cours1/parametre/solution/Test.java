package fr.miage.m1.cours1.parametre.solution;

public class Test {

	public void swap(int a, int b) {
	   int tmp = a;
	   a = b;
	   b = tmp;
	}
		
	public void swap2(Integer a, Integer b) {
		Integer tmp = a;
		a=b;
		b = tmp;
	}
//	
	public void swap3(Integer a, Integer b) {
		int tmp = a.intValue();
		a = new Integer(b.intValue());
		b = new Integer(tmp);
	}
//	
	public void swap4(MyInt a, MyInt b) {
		MyInt tmp = a;
		a=b;
		b = tmp;
	}
//	
	public void swap5(MyInt a, MyInt b) {
		int tmp = a.getValue();
		a.setValue(b.getValue());;
		b.setValue(tmp);
	}

	
	public static void main(String[] args) {
      Test t = new Test();
//	  int a = 0;
//	  int b = 5;
//      t.swap(a, b);
//	  System.out.println("Test.main() 1 a = " + a);
//	  System.out.println("Test.main() 1 b = " + b);
//	 
//	  System.out.println("--------------------------");

//	  Integer c = new Integer(0);
//	  Integer d = new Integer(5);
//	  t.swap2(c, d);
//	  System.out.println("Test.main() 2 c = " + c);
//	  System.out.println("Test.main() 2 d = " + d);
//	  System.out.println("--------------------------");
//
//	  
//	  Integer e = new Integer(0);
//	  Integer f = new Integer(5);
//	  t.swap3(e, f);
//	  System.out.println("Test.main() 3 e = " + e);
//	  System.out.println("Test.main() 3 f = " + f);
//	  System.out.println("--------------------------");
//
//	  MyInt g = new MyInt(0);
//	  MyInt h = new MyInt(5);
//	  t.swap4(g, h);
//	  System.out.println("Test.main() 4 e = " + g);
//	  System.out.println("Test.main() 4 f = " + h);
//	  System.out.println("--------------------------");
//
	  MyInt i = new MyInt(0);
	  MyInt j = new MyInt(5);
	  t.swap5(i, j);
	  System.out.println("Test.main() 5 e = " + i);
	  System.out.println("Test.main() 5 f = " + j);
	  System.out.println("--------------------------");

	}
}
