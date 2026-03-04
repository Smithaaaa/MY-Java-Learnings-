package Programs;

public class Car    //creating class with keywords public and class,Car has its own attributes and properties
{
    private String engine ;  //Data members(variable) of a class 
    private String  steering;     
    private String color;  
    private String brake; 
    
    //Setter function and getter function will always be public,So that we can access anywhere in the application
    //if its public then only we can access that setter function and getter function outside the class
    /* If we want to set the values to the variable/retrieve the values of the variable out side the class,Since it is
    private ,we need to create setter function and getter function to access this variable
    */
    public void setEngine(String engine) {
    	this.engine = engine;  //we are using this keyword to different between datamembers(variables) and argument variable of setterfunction
    }
    
    public String getEngine() {
    	return this.engine;
    }
    public void setSteering(String steering) {
    	this.steering = steering;
    }
    
    public String getSteering() {
    	return this.steering;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    
    public String getColor() {
    	return this.color;
    }
    //Setter function to set the values to the variables in the class
    public void setBrake(String brake) {
    	this.brake = brake;
    }
    //Getter function is to get the values from the class
    
    public String getBrake() {
    	return brake;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();//Object creation
		c.setBrake("Emergency brake");  //set the values to Brake
		c.setColor("Blue"); //set the values to color
		c.setEngine("Petrol Engine");     //set the values to Engine
		c.setSteering("Steering wheel");   //set the values to Steering
		
		
		
       
	}

}
/*Class is a group of similar objects.
 Class represents real world objects and its properties. ex:car,fruit,human being
We can have class in java without creating objects
Class contains data members(variables) and member functions(methods/functions)
private is a keyword(Access Modifier)which can be accessed within the class and String is a class type,is a wrapper class type to store
Sequence of Characters in Java. 
If we want to access data members like engine,steering ,color,brake which belongs to class car,Inside
Another class cardetails if we want to access then directly we cannot access,bcoz class car is having a attributes as private
If Any data member is private it can be accessed only within the same class.
If we want to access the datamembers outside the class,then we will be using member functions.
Member function is nothing but setter function and getter function.
Setter function is used to assign the values to the variables.
Getter function is used to get the values to the variables.
*/
