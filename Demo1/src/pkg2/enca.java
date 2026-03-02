package pkg2;

public class enca {
	private int rno;
	private String name;
	
	public void setRno(int rno)
	{
		this.rno = rno;
		
	}
	
	public int getRno() {
		return rno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       enca e = new enca();
       e.setRno(01);
       System.out.println(e.getRno());
       e.setName("Sam");
       System.out.println(e.getName());
       
	}

}
