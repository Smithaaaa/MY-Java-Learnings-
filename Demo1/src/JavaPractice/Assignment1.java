import java.sql.SQLOutput;

public class Assignment1 {

    public static void main(String[] args) {
       String Person = Details("Smitha","C","smitha@gmail.com");

       // System.out.println("Smitha" + " C "+ "As a name with email id" + " " +"csmitha@gmail.com" );
    }

    private static String Details(String firstName,String lastName,String emailId ){
        String Person = firstName+ "  " +lastName ;
        System.out.println(Person + "  " + "has email with Id" +" "+  emailId);

        return firstName+ " " +lastName + " " +emailId;
    }
}
