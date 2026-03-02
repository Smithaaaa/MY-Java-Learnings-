package pkg2;

class A5{
	A5 String()
	{
		return this;
	}
}

public class B1 extends A5{
	
	@Override
	B1 String() {
		return this;
	}
	
	void message() {
		System.out.println("Welcome to covariant return type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new B1().String().message();
	}

}
