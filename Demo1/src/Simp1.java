
public  class Simp1 {
	
	int p =90;
	 static int m= 50; //static variable;
	static void method() {
		int d = 100;//local variable
		System.out.println(d);
	}
	void method1() {
		int f = 121;//local variable
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int n = 20;//instance variable
        Simp1 s1 = new Simp1();
        System.out.println(s1.p);
        //System.out.println(f);
         s1.method1();
        System.out.println(m);
        method();
        System.out.println(n);
	}

}

//public class Simp1{
//	static void myMethod() {
//		System.out.println("I just got executed!"); 
//		}
//	public static void main(String[] args) 
//	{ 
//		myMethod(); 
//		}
//	}