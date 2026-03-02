package JavaPractice;

public class IfElseCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //We can also change value of our variable.Variable itself means change.
		  int num = 5;  //int ->4bytes ->32bits -> -2,147,483,648 to 2,147,483,648
		  num = 8;
		  System.out.println(num);
		  
		  float percent1 = 5.5f;   //4bytes
		  
		  double percent = 5.5;    //8 bytes
		  
		  short s = 5; //2bytes ->16bits ->-32768 to 32768
		  
		  byte b = 5; //1byte ->8bits ->-128 to 127
		  
		  long l = 5l ; //8bytes
		  
		  char c ='A'; 
		  c = 66; //we can assign a integer value to the character
		  System.out.println(c); //66 is a ASCII Value
		  //ASCII ->every character in our keyboard there is a unique number
		  //American Standard code for information interchange
		  
		  double d1 = 5;//implicit conversion
		  //double supports int value
		  System.out.println(d1);
		  
		  int k = (int)5.6; //explicit conversion(type casting)
		  System.out.println(k);
		  
		  //byte->short and char ->int ->long->float ->double
		  
		  
	}

}
