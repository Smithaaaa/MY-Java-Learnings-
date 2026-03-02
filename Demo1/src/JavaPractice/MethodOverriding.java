package JavaPractice;

class Cars
{
	void Speed()
	{
		System.out.println("Speed of the car is 80km/h");
	}
}

class Bike extends Cars{
	 void Speed()
	 {
		 System.out.println("Speed of the bike is 100km/h");
	 }
	 
	 void color() {
		 System.out.println("Color of bike is black");
	 }
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Cars c = new Cars();
	c.Speed();
	
	Bike b  = new Bike();
	 b.Speed();
	 b.color();
	
	Cars c1 = new Bike();
	
	 c1.Speed();
   //c1.color();
	 
    //Bike b1 = new Cars();
	 
	 }

}
