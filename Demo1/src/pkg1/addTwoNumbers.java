//Factorial program
package pkg1;

import java.util.Scanner;

public class addTwoNumbers {
	
	public static void factorial(int num) {  //method
       
     
		//here we can write a condition ,like if there is less than 0,then return invalid
         if(num <  0) {
        	 System.out.println("Invalid number ");
        	 return;
         }
         int fact = 1;
		for(int i = num ; i>=1; i--) {  //for loop
			fact = fact * i;
		}
		
		System.out.println(fact);
		return;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.close();
		factorial(n);
		}
}
