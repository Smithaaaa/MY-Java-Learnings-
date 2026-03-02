package pkg2;
import java.util.*;
public class Al {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		//String item = {"apple","mango","banana","grapes","custardapple","mango","banana","apple","mango","watermelon"};
		ArrayList<String> item = new ArrayList<String>();
		item.add("Apple");
		item.add("Mango");
		item.add("Watermelon");
		item.add("Apple");
		item.add("banana");
		item.add("grapes");
		item.add("Mango");
		item.add("Apple");
		System.out.println(item);
		System.out.println("=================================");
		item.add(1, "Melonmusk");
		item.add(5, "orange");
		System.out.println(item);
		System.out.println("==================================");
		System.out.println(item.get(4));
		System.out.println(item.get(7));
		System.out.println(item.get(2));
		System.out.println("===================================");
        
	}

}
