public class Encap1 {

    private String firstName;
    private String lastName;
    private int id;


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  int  getID(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public static void main(String[] args) {
        {
            Encap1 e1 = new Encap1();
            e1.setFirstName("Divya");
            e1.setLastName("Sharma");
            e1.setId(123);
            System.out.println(e1.getFirstName());
            System.out.println(e1.getlastName());
            System.out.println(e1.getID());
        }
    }
}
