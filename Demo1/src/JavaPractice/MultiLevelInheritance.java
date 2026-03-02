package JavaPractice;

class Person
{
	String name = "Ram";
	
	void Work()
	{
		System.out.println("Person works for 9hours");
	}
	
	void LunchBreak()
	{
		System.out.println("Lunchbreak is 45mins");
	}
	
}

class Emp extends Person
{
	void Salary()
	{
		System.out.println("Employee gets salary of 25k");
	}
	
	@Override
	void Work()
	{
		System.out.println("Person works for 9hours");
	}
	
	@Override
	void LunchBreak()
	{
		System.out.println("Lunchbreak is 45mins");
	}
	
}

class Emp1 extends Emp
{
	@Override
	void Salary()
	{
		System.out.println("Employee gets salary of 25k");
	}
	
	@Override
	void Work()
	{
		System.out.println("Person works for 9hours");
	}
	
	@Override
	void LunchBreak()
	{
		System.out.println("Lunchbreak is 45mins");
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p = new Person();
      System.out.println(p.name);
      p.Work();
      p.LunchBreak();
      
      System.out.println("**************************");
      
      Emp e  = new Emp();
      e.Work();
      e.LunchBreak();
      e.Salary();
      
      System.out.println("**************************");
      Emp1 e1  = new Emp1();
      e1.Work();
      e1.LunchBreak();
      e1.Salary();
	}

}
