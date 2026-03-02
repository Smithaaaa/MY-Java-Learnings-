package JavaPractice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=0; i<5; i++)
          System.out.println(i);
          
          System.out.println("================================");
          
          String[] cars = {"audi","honda","kia","ford","bmw"};
          for(String i :cars) {
        	  System.out.println(i);
          }
          
          System.out.println("==================================");
          String[] cars1 = {"audi","honda","kia","ford","bmw"};
          for(String i :cars1) {
        	  System.out.println(cars[2]);
          }
          
          System.out.println(("====================================="));
          //appending string value
          String[] cars2 = {"audi","honda","kia","ford","bmw"};
             cars2[0]="mini cooper";
             System.out.println(cars2[0]);
             System.out.println(cars2.length);
             
             System.out.println("==================================");
          
           int[] items = {1,2,3,4,5,6,7 };
           for(int i :items) {
        	   System.out.println(i);
           }
           
           System.out.println("=====================================");
           int[] items1 = {1,2,3,4,5,6,7};
           for(int i :items1) {
        	   System.out.println(items[2]);
           
           }
           
           System.out.println("=======================================");
           int[] items2 = {1,2,3,4,5,6,7 };
           items[0] = 11;
           System.out.println(items[0]);
           System.out.println(items2.length);
           
           System.out.println("=======================================");
           
           int n= 5;
           int sum = 0;
           for(int i =0 ;i<= n;i++)
           {
        	   sum=sum +i;
        	  
        	   
        	   
           }
           System.out.println(sum); 
	}
}
//WAP to print 0,2,4,8,10