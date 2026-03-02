package JavaPractice;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "hello";
      System.out.println("The length of the String a is :" + a.length());
      
      String text = "java is easy";
      System.out.println(text.toUpperCase());
      
      String text1 = "JAVA IS EASY";
      System.out.println(text1.toLowerCase());
      
      //Here the index starts from 0
      String text3 = "the index of the string";
      System.out.println(text3.indexOf("string"));
      
      String mystr = "begin";
      String mystr1 = ".com";
      System.out.println(mystr + mystr1);
      System.out.println(mystr .concat(mystr1));
      String mystr11 = "begin \n " ;
      String mystr111 = ".com";
      System.out.println(mystr11.concat(mystr111));
      
      String t3 = "java  \n is easy ";
      System.out.println(t3);
      
      String t4 = "java  \r is easy "; //split
      System.out.println(t4);
      
      String t5 = "java  \t is easy ";
      System.out.println(t5);
      
      String t6 = "ja\bva is easy ";
      System.out.println(t6);
      
      //boolean ->true or false
      
      boolean a1 = true;
      System.out.println(a1);
      
      int a11 = 5;
      int b11 = 10;
      System.out.println(a11 > b11);
      System.out.println(a11 < b11);
      System.out.println(a11 == b11);
      System.out.println(a11 != b11);
      
      
      
	}

}
