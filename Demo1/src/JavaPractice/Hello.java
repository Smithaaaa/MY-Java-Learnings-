package JavaPractice;

public class Hello {
     // int a = 20;
      //int b = 30;
      //int c = a + b;
     // String name1 ="Smitha";
      //String name2 ="Shilpa";
      
      

	public static void main(String[] args) {
		//  byte->1byte data
		// short->2byte data
		// int->4 bytes data
		//long->8bytes data
		//float->4 bytes data
		//double->8 bytes data
		//boolean->1bit
		//char->2bytes
		  byte f = 10;
		  short g1 = 200;
		  int a = 20;
	      int b = 30;
	      long h= 1000;
	      String name1 ="Smitha";
	      String name2 ="Shilpa";
	      float d = 8.5f;
	      double j = 55.5;
	      char s = 'A';
	      boolean g = true;
		// TODO Auto-generated method stub
      System.out.println("Hello World!!!");
      System.out.println(a + b);
      System.out.println(name1 +"  " + name2); 
      System.out.println(d);
      System.out.println(s);
      System.out.println(g);
      System.out.println(f);
      System.out.println(g1);
      System.out.println(j);
      System.out.println(h);
      
      //float 8 bytes
      //typecasting is when we assign a vlaue of one primitive data to another type
      //or converting one primitive type to another
      //there are 2 types
      //1)Widening 2)Narrow
      //1)Converting smaller datatype to longer datatype ->widening(done automatically)
      //2)Converting larger datatype to a smaller datatype->this as to be done manually by users(narrowing)
      
      
 }
}