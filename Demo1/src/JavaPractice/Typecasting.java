package JavaPractice;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Widening
	 int a = 100;
     long l = a;
     System.out.println(a);
     System.out.println(l);
     
     //Narrowing
     double d = 500.00;
     float f = (float) d;//this is done by manually
     System.out.println(d);
     System.out.println(f);
	}

}
