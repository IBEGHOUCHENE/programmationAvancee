package fr.miage.m1.cours1.parametre.solution;

public class MyInt {
     private int value ;
     
     public MyInt(int v) {
    	   value = v;
     }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return ""+ value;
	}

          
     
}
