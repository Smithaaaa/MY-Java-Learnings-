package JavaPractice;

abstract class Bike11
{
	abstract void peddle();
}

class Cycle extends Bike11
{
	void peddle()
	{
		System.out.println("Peddling");
	}
	public static void main(String[] args) {
		Bike11 b = new Cycle();
		b.peddle();
		
	}
}
