package JavaPractice;

class TajHotel{
	
	String a = "Dosa";
	String b = "Idly";
	String c = " Rava Idly";
	String d = "Masala Vada";
	
	public void display(String name,int price) {
		switch(name) {
		case "a": System.out.println("The Dosa price is : " + price);
		        break; 
		case "b" :System.out.println("The Idly price is : " + price);
		        break;
		case "c": System.out.println("The Rava Idly price is : " + price);
		        break;
		case "d" :System.out.println("The Masala Vada price is : " + price);
		        break;
		default :System.out.println("Thank You" );  
		}
			
	}
		

	void Show(String name)
	{
    		System.out.println("THANK YOU !!!");
	}
	
} //so here TajHotel closes		

public class HotelBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TajHotel th = new TajHotel();
		
		// You pass prices directly while calling
		th.display("a",85);  // Prints Dosa price
		th.display("b",66);   // Prints Idly price
        th.display("c",75);   // Prints Rava Idly price
        th.display("d",30);   // Prints Masala Vada price
        th.display("e",0);   // Prints Thank You (default)//This will call the 1st display method with parameters
        th.Show(""); //this will call Display1 method to print thank you
		
	}

}
