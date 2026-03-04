import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number : ");
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       System.out.println(num);
       scan.close();
       
     // for(int i = 0; i<=num; i++) {
       
       if(num%2==1) {
    	   System.out.println("It is a prime number");
       }
       else
       {
    	   System.out.println("It is not a prime number");
       }
	}

  //}
}