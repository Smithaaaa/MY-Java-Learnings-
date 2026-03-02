package pkg1;
import java.util.HashMap;

public class hashMap11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	HashMap <String,Integer> map = new HashMap<>();
	       map.put("Rahul",101);
	       map.put("Ramesh",102);
	       map.put("Rakesh",103);
	    System.out.println("Size of map is " + map.size());
	    System.out.println(map);
	
	     if(map.containsKey("Ramesh")) {
	    	 
	    	Integer a = map.get("Ramesh");
	        System.out.println("value of key " + " \"Ramesh\" is :- " +a);
	        
	        
	    	                                    
	     }

	}
	

}
