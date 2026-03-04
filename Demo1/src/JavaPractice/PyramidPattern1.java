package Programs;

public class PyramidPattern1
{

  public static void main(String args[])
 {

   int n =25;

   for(int i=1; i <= n;i++) //to iterate n number of times
   {
  
     for(int j=1; j <= n-i; j++)  //to handle the spaces
     {
        System.out.print(" ");
     }
    
      for(int k=1; k <= (2*i)-1; k++)  //to print *
     {
        System.out.print("*");
     }

       System.out.print("\n");

 } 

}

}

