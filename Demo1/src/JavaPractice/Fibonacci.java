package JavaPractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int a =1;
		int b =a ;
		System.out.println("Enter a number :");
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n);
		scan.close();
		
		for(int i = 0;i<=n;i++) {
			sum = sum + a;
			a = b;
			b = sum;
			System.out.println(sum);
		}

	}

}
