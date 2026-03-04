package Programs;

	class Encap { // class name
		

		public Encap() { // default constructor or zero argument constructor in which we cannot pass arguments
	                                // it will be invoked once the object is created
			
		}
		
		private int id; // instance variables
		private float salary;
		private String name;

		public int getId() { // getters method or function or member function 
			return id;     // it will return the id once it get invoked
	                           // getters method is used to retrieve or to get the data
		}

		public float getSalary() { // to get the salary
			return salary;     // it will return the age once it get invoked
		}

		public String getName() { // to get the name
			return name;         // it will return the name once it get invoked
		}

		public void setId(int id) {  // setter function to set the data
			this.id = id;         // to set the id
		}

		public void setSalary(int salary) { // to set the salary
			this.salary = salary;
		}

		public void setName(String name) { // to set the name
			this.name = name;
		}
	}
		
	  class EncapMain{   //another class of different class name

		public static void main(String[] args) {   // main method in which execution starts
			Encap e = new Encap();  // creating an object for encapsulation class
			e.setId(777);  // by using the object reference setting the id
			e.setSalary(25000);  // by using the object reference setting the age
			e.setName("smitha");  // by using the object reference setting the name
			
			System.out.println("name :"+ e.getName());  // printing statement - this will print the name
			System.out.println("id :"+ e.getId());      // this will print the id
			System.out.println("age :"+ e.getSalary());    // this will print the age
			
		}


		}





