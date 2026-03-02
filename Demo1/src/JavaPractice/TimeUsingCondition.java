package JavaPractice;

public class TimeUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 4;
     if (time > 3) {
    	 System.out.println("good day");
     }
     
     //if - else
     int time1 = 12;
     if(time1 >10 ) {
    	 System.out.println("good day ");
     }
     else {
    	 System.out.println("bad day");
     }
     
     //else -if condition
     int time2 = 5;
     if(time2 >= 10)
     {
        System.out.println("good day");
     }
     else if(time2 > 15)
     {
    	 System.out.println("good day");
     }
     else
     {
    	 System.out.println("bad day");
     }
  System.out.println("-----------------------------------------");   
        int time3 =20;
        String result =(time3 <18) ? "good morning " : "good noon";
        System.out.println(result);
     }
}
