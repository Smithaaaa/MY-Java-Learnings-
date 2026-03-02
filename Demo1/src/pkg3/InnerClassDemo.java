package pkg3;
class outer{
	 int a =20;
	 void show()
	 {
		 
	 }

	 
        class inner {
	 
		 void display() 
		 {
			 System.out.println("This is to display method");
		 }
     }
}


public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		outer obj = new outer();
		obj.show();
		
		outer.inner obj1 = obj.new inner();
		obj1.display();
		
		
	}

}
