package pkg2;

class A2
{
	int rno =20;
	void Sum() {
		System.out.println("This is a parent class method");
	}
}
public class inher1 extends A2{
	
	@Override
	void Sum() {
		System.out.println("This is a child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      inher1 i1 = new inher1();
      i1.Sum();
      System.out.println(i1.rno);
	}

}
