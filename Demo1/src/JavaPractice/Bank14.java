package JavaPractice;

abstract class HdfcBank
{
	abstract void Withdraw();
}

public class Bank14 extends HdfcBank {
	
	public void Withdraw()
	{
		System.out.println("Withdrawing Money");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank14 bb = new Bank14();
		bb.Withdraw();

	}

}

//
