package Programs;

class School {
	String name = "Chitrakoota";    //instance variable of parent class

	void subject() {            //Method in parent class
		System.out.println("There are 6 subjects"); //print the statement in console
	}
}

public class SuperKey2 extends School {

	void subject() //Method in child class
	{
		super.subject(); // super keyword used in child class to access parent class method
		System.out.println("General Knowledge is a Subject"); ////print the statement in console
	}

	public static void main(String[] args) { //Main function
		SuperKey2 sk = new SuperKey2(); //creating an object reference for child class and invoking the child class constructor
		sk.subject();
		System.out.println(sk instanceof School);
	}
}
