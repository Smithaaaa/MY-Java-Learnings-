package pkg3;

public class demo1 {
	
	private int rno;
	private String name;
	
	

	public int getRno() {
		return rno;
	}



	public void setRno(int rno) {
		this.rno = rno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demo1 d = new demo1();
        d.setRno(11);
        System.out.println(d.getRno());
        d.setName("Ram");
        System.out.println(d.getName());
        
	}

}
