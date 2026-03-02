package JavaPractice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int num = scan.nextInt();
		
		
		int fact = 1;
		for(int i =1 ;i<=num;i++) {
			fact = fact *i;
		}
			System.out.println("Factorial of a given number : " + fact);
		
  }
}  