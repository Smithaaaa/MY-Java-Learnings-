package pkg1;

class A
{
	int a = 20;
void sum()
{
	System.out.println("sum");
}
}
public class Student extends A
{
	
void sum()
{
	super.sum();  //super keyword used in child class to access parent class method
	System.out.println("I m sim");
}
	public static void main(String[] args) {
		Student a=new Student();
		a.sum();
		System.out.println(a instanceof A);
	}
}


