package JavaPractice;

class Animal
{
	void eating() {
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	void Bark()
   {
	System.out.println("Dog Barks");	
   }
}

class Cat extends Animal
{
	void Meow()
   {
	System.out.println("Cat Meows...");	
   }
}
	

public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Dog d = new Dog();
    d.Bark();
    d.eating();
    //d.Meowk();
    
    System.out.println("*********************");
    Cat c = new Cat();
    c.eating();
    c.Meow();
    //c.Bark();
	}

}
