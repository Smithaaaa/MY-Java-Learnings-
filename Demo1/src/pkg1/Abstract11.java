package pkg1;

abstract class A11{
	A11(){
		System.out.println("This is a constructor");
	}
	
	void display() {
		System.out.println("This is a method");
	}
	
	abstract void simpleProgramming();
}

public class Abstract11 extends A11 {
	
	@Override
	void simpleProgramming() {
		System.out.println("This is from Abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abstract11 aa = new Abstract11();
    aa.display();
    aa.simpleProgramming();
	}

}
