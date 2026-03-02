package pkg3;
class outer1
{
	static String s = "Smi";
	public static void show() {
		System.out.println(("welcome"));
	}
	
	static class inner1
	{
		public void display() {
			System.out.println("Hello world");
		}
	}
	
}


public class InnerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer1 obj = new outer1();
		obj.show();
		
		outer1.inner1 obj1 = new outer1.inner1();
		obj1.display();
		
				

	}

}
