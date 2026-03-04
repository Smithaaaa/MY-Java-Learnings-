import java.util.Scanner;

public class Fibonacci {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n1=0,n2 = 1,n3,count=10 ;
		/*
		 * Scanner sc = new Scanner(System.in); int n3 = sc.nextInt();
		 */
		
		//sc.close();
		
		for(int i =2;i<=count;i++) {
			n3 = n1+ n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n3);
		}
		
		
		/*
		 * int sum =0; int a =1; int b = sum;
		 */
		 
		/*System.out.println("Enter the number :");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Output is : " + n);
		sc.close();
		
	   for(int i =1 ; i<= n ; i++) {			
		   sum = sum +a;
		   a = b;
		   b = sum;
		   System.out.println(sum);
	   }*/
		
	}

}
