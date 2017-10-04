package fr.miage.m1.cours1.inner;

import java.io.File;
import java.io.FilenameFilter;

public class MonTP {

	static int attr = 0;
	
	private int attrNonStatic = 10;
	
	public void foo() {
		System.out.println("MonTP.foo()");
	}
	
	 class MonFiltre2 implements FilenameFilter {
		@Override
		public boolean accept(File dir, String name) {
			System.out.println(attr);
			System.out.println(attrNonStatic);
			foo();
			return false;
		}
	}
	
	public static void main(String[] args) {
		MonTP tp = new MonTP();
		File[] f= new File(".").listFiles(tp.new MonFiltre2());
		for (int i = 0; i < f.length; i++) {
			File file = f[i];
			System.out.println(file);	
		}
		
		
		f = new File(".").listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				System.out.println("MonTP.main() anonymous");
				this.foo();
				return false;
			}
			
			public void foo() {
				System.out.println("MonTP.main()");
			}
			
		}
				
				
				);
		
	}
	
	FilenameFilter monFiltre3 = new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			System.out.println("MonTP.main() anonymous");
			this.foo();
			return false;
		}
		
		public void foo() {
			System.out.println("MonTP.main()");
		}
		
	};
			
	
	
}
