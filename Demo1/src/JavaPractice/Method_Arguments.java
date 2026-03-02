package JavaPractice;

public class Method_Arguments {

	
	  public static int add2(int a, int b) { 
		  int sum = a + b; 
		  return sum;
		  }
	 
    
	public static void add(int a, int b) {

		System.out.println("Addition : " + (a + b));
	}
	
	static int add1(int x ,int y) {
		return x + y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
        System.out.println(add2(5,6));
        System.out.println("=============");
		add(5,6);
		System.out.println("=============");
		int z= add1(10,5);
		System.out.println(z);
		
	}
}
