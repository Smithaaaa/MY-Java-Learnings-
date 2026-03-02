package pkg2;

public class TryCatchBlock {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=30/0;
			System.out.println("hi");
		}
		catch(ArithmeticException e) {
			System.out.println("Hello");
		}
			finally{
				System.out.println("Welcome");
			}
	
		
		
		}
	}


