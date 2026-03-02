package JavaPractice;

abstract class Animal21 {
	
	public abstract void animalSound();
	
	public void sleep()
	{
		System.out.println("Zzzz");
	}
}

class pig extends Animal21{
	public void animalSound() {
		System.out.println("weee");
	}
}

class Main11
{
	public static void main(String[] args) {
		pig p = new pig();
		p.animalSound();
		p.sleep();
	}
}