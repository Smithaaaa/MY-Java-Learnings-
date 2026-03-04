package Programs;

public class Armstrong    //creating class
{

  public static int computePower(int n,int l)  //creating a function to calculate the power of numbers
  {
     int c=1;                      //creating a variable called 'c' and assigning 1 as value
     for(int i=0;i < l;i++)        //creating for loop to iterate how much power it has to calculate
     {
	     c=c*n;                      //it is a formula to calculate the power according to the arguments
     }
      return c;                    //here we return the 'c' value to function

  }
  public static void main(String[] args)  //creating main method
  {
    int n=154;             //creating a variable called 'n' and assigning the value which is considered as input
    int temp=n;            //creating a variable as 'temp' and assigning the 'n' value to 'temp'
    int output=0;          //creating a variable as 'output' and assigning the value as 0 
    int length=0;          //creating a variable as 'length' and assigning the value as 0
    while(temp>0)         //creating while loop to find the length of the given 'n' value
    {
	    temp=temp/10;       //removing the last digit from the 'temp' value
	    length++;          //incrementing the length by 1
    }
    temp=153;          //re-assigning the temp value as 153
    while(temp>0)      //creating while loop to iterate and calculate the final output
    {
	    output=output+computePower(temp%10,length);        //adding the output value to the returned value from called function
	    temp=temp/10;            //removing the last digit from the 'temp'
    }
   
    if(n==output)            //creating 'if' statement to compare between the input value which is 'n' is equal to the final 'output' value
    System.out.println("the given number is an Armstrong number");   //if the 'if' statement is true then it will print "the given number is an Armstrong number"
    else                       //creating else statement if the 'if' statement is false 
    System.out.println("the given number is not an Armstrong number");    //if the 'if' statement becomes false it will print 
                                                                          //"the given number is not an Armstrong number"
  }
}

