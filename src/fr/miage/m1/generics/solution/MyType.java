package fr.miage.m1.generics.solution;

public class MyType<K> {
		K x ; 
		
		public MyType(K x) { this.x=x;}
		
		public K getX() {
			return x;
		}

		public void setX(K x) {
			this.x = x;
		}

	public static <K> boolean equals(MyType<K> m1, MyType<K> m2) {
		return  m1.getX().equals(m2.getX());
	}
	
	public static void main(String[] args) {
		
		MyType<Integer> m1 = new MyType<>(1);
		MyType<Integer> m2 = new MyType<>(1);
		MyType.<Integer>equals(m1,m2);
		//avec inference de type
		MyType.equals(m1,m2);	
	}
}
