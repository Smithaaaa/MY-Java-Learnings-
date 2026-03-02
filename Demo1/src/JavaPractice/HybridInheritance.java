package JavaPractice;

class rbi{

	void bank()
	{
		System.out.println("prints money");
	}
}
class bank extends rbi{
	void subbank() {
		System.out.println("Create accunt");
	}
}

class canara extends bank{
	void bank1() {
		System.out.println("Canara create accounts");
	}
}
class sbi extends bank{
	void bank2() {
		System.out.println("sbi create account");
	}
}
class icici extends bank{
	void bank3() {
		System.out.println("icici create account");
	}
}


//Combination of 2 or more inheritance
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rbi r1 = new rbi();
		r1.bank();
		
		System.out.println("***************************");
		canara c1 = new canara();
		c1.bank();
		c1.bank1();
		System.out.println("***************************");
		sbi s1 = new sbi();
		s1.bank();
		s1.bank2();
		System.out.println("****************************");
		icici i1 = new icici();
		i1.bank();
		i1.bank3();

	}

}
