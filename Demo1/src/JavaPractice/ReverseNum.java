package Programs;

public class ReverseNum { //create class
	
	  public static void main(String[] args)    // main method opening
	  {
	    int n=56321;        //creating a variable as 'n' and assigning value which is considered as input.
	    int rev=0;          //creating a variable as 'rev' and assigning value as 0.
	    while(n>0)          //creating while loop to iterate given input.
	    {
		rev=rev*10+n%10;      //we are taking the last digit from input by modulo division and adding it
	   				              //to the previously stored rev value which is multiplied by 10.
		n=n/10;               //keep on removing the last digit from the 'n' value
	    }
		System.out.println("reversed num :"+rev);     //printing the last result which is stored  in the 'rev' variable.
				
	  }
	}


