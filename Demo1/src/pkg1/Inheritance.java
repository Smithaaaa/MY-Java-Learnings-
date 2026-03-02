package pkg1;

class B13{
	void Sum() {
		System.out.println("This is A B13 class method");
	}
}
public class Inheritance  extends B13{

	@Override
	void Sum() {
		System.out.println("This is a Inheritance class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B13 b = new B13();
		//b.Sum();
		Inheritance ii = new Inheritance();
		ii.Sum();
	}

}
