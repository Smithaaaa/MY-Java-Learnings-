package pkg1;
import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map =  new HashMap<>();
		
		map.put("Smitha", 100);
		map.put("Ramya", 98);
		map.put("kavya", 99);
		
		 System.out.println("Size of map is :" +map.size());
		 
		 System.out.println(map);
		 
		 if(map.containsKey("Smitha")) {
			 
			 Integer a = map.get("Smitha");
			 System.out.println("Value of the key is " + " \"Smitha\" is :- " + a);
			
		 }
		}
	
}


