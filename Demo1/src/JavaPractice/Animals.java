package JavaPractice;

class Animals1 {
	
	public void eating() {
		System.out.println("animals eat fruits and vegetables");
	}
	
	public void sleeping() {
		System.out.println("animals do sleep");
	}
}
	
class Monkey extends Animals1
{
	public void jump() {
		System.out.println("it jumps from tree to tree");
	}

}

class Animals{	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Animals1 an = new Animals1();
	 //  an.jump();
	   an.eating();
	   an.sleeping();
       Monkey mon = new Monkey();
       mon.eating();
       mon.sleeping();
       mon.jump();
	}

}
