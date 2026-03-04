package Programs;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =35;  //variable a contains 35 with integer has datatype
		int b= 26;  //variable b contains 26 with integer has datatype

		if(a % 2 != 0) //35 % 2 = 1 (1!=0)
		System.out.println("The given number " + a +" is odd number");
		//the given number 35 is odd

	}

}

/* 
 Simple If Statement
Check if the Given Number is Odd
(Basic Simple Math)
If we Divide any number by 2 and if the reminder is equal to zero
then its even number and if reminder is not equal to zero then 
its odd number'
We can get reminder using modulus  division and non-modulus division 
give us quotient.
== --->To check the equality of numbers(comparision),to get the 
equality of numbers/characters.
For comparining Strings we cannot use ==(double equals),here we use
equal methods in string class to compare
= --->Assignment operator which helps us to assign values to a variable
!-->Not operator opposite to actual value
if(a % 2 == 0)-->Even
if(a % 2 !=0)-->Odd
-->open and close curly braces are used to if statements when there are 
multiple statements.
*/