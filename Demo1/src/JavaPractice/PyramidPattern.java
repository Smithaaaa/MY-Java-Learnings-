package Programs;

public class PyramidPattern //class name is pyramid pattern
{

	public static void main(String args[]) //main method
	 {
		int n=6; //number of lines of stars you want to print
		for(int i=1;i<=n;i++)//outer loop for n  number of iterations 
		{
			for(int j=1;j<=n-i;j++)//inner loop to handle the spaces
			{
 				System.out.print(" ");
 			}
 			for(int k=1;k<=(2*i)-1;k++)//inner loop to print *
 			{
 			  System.out.print("*");
 			 }
 			  System.out.println("\n");//cursor shift to next line
 		    }
 		}
 				

	}
