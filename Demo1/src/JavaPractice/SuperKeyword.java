package Programs;

class Drawing  //parent class
{
	public Drawing()  // parent class constructor
	{
		System.out.println("Drawing");  //print statement to print in console
	}
}
public class SuperKeyword extends Drawing{  // child class inheriting the properties of parent class
	
	public SuperKeyword()  // child class constructor
	{
		super();  // super keyword will invoke the immediate parent class contructor inside the child class
		System.out.println("Drawing the picture ");  //print statement to print in console
	}

	public static void main(String[] args) {  //main function
		SuperKeyword s = new SuperKeyword(); //creating an object reference for child class and invoking the child class constructor

	}

}

