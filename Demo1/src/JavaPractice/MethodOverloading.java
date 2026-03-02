package JavaPractice;

public class MethodOverloading {
     public static void add(int a , int b) {
    	 System.out.println(a + b);
 
     }
     
     public static void add(int a , int b ,int c) {
    	 System.out.println(a + b + c);
     }
     
     public static void add(double a , double b) {
    	 System.out.println(a + b);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        add(4,5);
        add(3,6,9);
        add(11.5,12.5);
        
	}

}
