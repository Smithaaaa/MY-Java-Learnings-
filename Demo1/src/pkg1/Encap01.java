package pkg1;

public class Encap01 {
	
	private int rno;
	private String name;
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public int getRno() {
		return rno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Encap01 ee = new Encap01();
       ee.setRno(01);
       System.out.println(ee.getRno());
       ee.setName("Sam");
       System.out.println(ee.getName());
	}

}
