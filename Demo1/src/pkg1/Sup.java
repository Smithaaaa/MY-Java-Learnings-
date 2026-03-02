package pkg1;
class S{
	int a =120;
	
	void disp()
	{
		System.out.println("This ia a method");
	}
}
public class Sup extends S{
	
	int a =180;
	
	
	@Override
	void disp() {
		super.disp();
		System.out.println("this method from child class");
		System.out.println(super.a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sup ss = new Sup();
     ss.disp();
     System.out.println(ss.a);
	}

}
