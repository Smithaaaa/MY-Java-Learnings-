package Singleton;

public class Account {
	
	private static Account obj = null;
	
	private Account() {
		System.out.println("Object Created");   //private Constructor
	}
	
	public static void createObject() {  //Static Method
		
		if(obj==null) {

		
		  obj = new Account();
		
	}
		else {
			System.out.println("cannot create object");
		}

}
}