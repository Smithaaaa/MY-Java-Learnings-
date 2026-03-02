package JavaPractice;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Arithmetic operator
		int a =10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a++);
		System.out.println(a--);
		//Assignment operator
		// =, += ,-= ,*= ,%= ,/=, !=
		int a1 = 5;
		System.out.println(a1);
		
		int b1 =5;
		b1=b1 + 3;
		System.out.println(b1);
		
		int b2 = 5;
		b2 = b2 & 3; 
		System.out.println(b2);
		
		//5 & 3->assignment(5 |3_->7
		//5 ^ 3->Not (^)
		// <<right shift
		//>> left shift
		//
		//Comparision Operator
		int a3 = 5;
		int b3 = 3;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a3);
		System.out.println(b3);
		
		//Logical operator
		System.out.println(a > 2 && a<10 );
		System.out.println(a >2  || a <10);
		System.out.println(!(a > 2 && a<10 ));
		
		
		
		
		
	}

}
