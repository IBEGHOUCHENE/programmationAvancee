package fr.miage.m1.cours1.parametre;

public class MyInt {
	private int i;

	public MyInt(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return ""+i;
	}
	
	

}
