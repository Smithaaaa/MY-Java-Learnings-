package pkg2;

abstract class A{
	A(){
		System.out.println("This is from Constructor");
	}
	
	void disp() {
		System.out.println("This a method");
	}
	
	abstract void Sum();
}

public class abst extends A {
	
	@Override
	void Sum() {
		System.out.println("This ia a abstracted method which is overridden");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      abst a = new abst();
      a.Sum();
      a.disp();
	}

}
