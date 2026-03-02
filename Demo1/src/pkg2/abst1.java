package pkg2;

class A1{
	int a2 =10;
	
	void disp()
	{
		System.out.println("This is a disp method");
	}
}

public class abst1  extends A1{

	  int a = 25;
	  
	  void Sum()
	  {
		  int a1 = 25;
		  System.out.println(a1+this.a+super.a2);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         abst1 a1 = new abst1();
         a1.disp();
         a1.Sum();
         }

}
