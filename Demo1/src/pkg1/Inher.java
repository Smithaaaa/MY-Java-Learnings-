package pkg1;


  class B14{ 
	  int rno; 
	  void sum() {
      System.out.println("Sum method from B14 class"); 
      
	 }
 }
  
  public class Inher extends B14 {
  
  int rno =3;
  
  void sum() { 
	  System.out.println("Sum method from Inher class"); 
	  }
  
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  Inher r = new Inher(); 
  r.sum(); 
  System.out.println(r.rno);
  
  }
  
  }
 

/*
 * class A { int rno=34; void sum() {
 * System.out.println("I m sum method from A c lass"); }
 * 
 * } public class Inher extends A { int rno=3; void sum() {
 * System.out.println("I m sum method from Student"); } public static void
 * main(String[] args) {
 * 
 * Inher s=new Inher(); s.sum(); System.out.println(s.rno);
 * 
 * }
 * 
 * }
 */


