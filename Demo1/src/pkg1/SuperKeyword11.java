package pkg1;


  class B11 {
	  B11(){
		  System.out.println("This is B11 Constructor"); 
		  } 
	  }
  
  public class SuperKeyword11 extends B11{
  
  SuperKeyword11(){ super();
  System.out.println("This is Superkeyword11 Constructor");
  
  }
  
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  SuperKeyword11 sk = new SuperKeyword11();
  
  }
  
  }
 

/*
 * class A { A() { System.out.println("I m A class constructor"); }
 * 
 * } public class SuperKeyword11 extends A { SuperKeyword11() { super();
 * System.out.println("I m student class constructor"); } public static void
 * main(String[] args) {
 * 
 * SuperKeyword11 s=new SuperKeyword11();
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */