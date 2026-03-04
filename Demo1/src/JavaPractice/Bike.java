
public class Bike extends Vehicle {
        void run() {
        	System.out.println("Bike is running");
        }
        
        public static void main(String[] args) {
        	//Overriding
        	
        	Bike obj = new Bike();
        	obj.run();
        	
        	Vehicle obj1 = new Bike();
        	obj1.run();
        	
        	Vehicle obj2 = new Vehicle();
        	obj2.run();
        }
}
