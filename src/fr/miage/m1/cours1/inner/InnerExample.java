package fr.miage.m1.cours1.inner;

public class InnerExample {
   int attribut;
   
   static int s_attribut;
   
   public InnerExample() {}
   
   class MaClasseInterne {
	    public MaClasseInterne() {
	    	     InnerExample.this.attribut++;
	    	     s_attribut++;
	    }
   }
     
   static class MaClasseInterneStatique {
	    public MaClasseInterneStatique() {
   	     s_attribut++;
   }
}
   
   
   
   public static void main(String[] args) {
	InnerExample ex= new InnerExample();
}
   
}
