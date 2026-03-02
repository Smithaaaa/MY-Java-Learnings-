package pkg1;


  class B { 
	  int a = 34; 
	  }
  
  public class abst extends B{
  
  int a11 = 36;
  
  void Sum() {
  int a2 =20;
  System.out.println(a2+this.a11+super.a); 
  }
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  abst a22 = new abst(); 
  a22.Sum();
  
  }
  
  }
 

/*class A
{
int a=34;
	
}
public class abst extends A
{
	int a=3;
	
void sum()
{
	int a=10;
	System.out.println(a+this.a+super.a);
}
public static void main(String[] args) {

	abst s=new abst();
	s.sum();
	
	
}*/
	

