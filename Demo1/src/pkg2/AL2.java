package pkg2;

import java.util.ArrayList;

public class AL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrli = new ArrayList<Integer>(5);
		arrli.add(50);
		arrli.add(30);
		arrli.add(100);
		arrli.add(80);
		arrli.add(45);
		
		arrli.add(2, 22);
		arrli.add(4, 73);
		for(int number :arrli) {
		System.out.println("Number =  " + number);
		}
	}

}
