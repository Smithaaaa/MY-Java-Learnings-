import java.util.Arrays;

public class Test {
    public static void main(String[] args){
       // System.out.println("Hello Java");
        String fullName  = getFullName("Smitha","C");
        String fullName1 = getFullName("Shilpa","C");
        System.out.println(fullName);
        System.out.println(fullName1);
    }

    private  static String getFullName(String firstName,String lastName){
        String fullName = firstName + "-" + lastName;
        System.out.println(fullName);

        return firstName +" " + lastName;
    }
    //accessmodifier returnType name(){}
}