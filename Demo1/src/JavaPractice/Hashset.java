import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs= new HashSet();
        hs.add("one");
        hs.add("Two");
        hs.add("Three");
        hs.add("one");
        hs.add("Three");

        System.out.println(hs);

        Student s1 = new Student();
        s1.name = "Smitha";
        s1.rollNo=11;
        Student s2 = new Student();
        s2.name = "Divya";
        s2.rollNo=12;
        Student s3 = new Student();
        s2.name = "Divya";
        s2.rollNo=12;
        Student s4 = new Student();
        s2.name = "Ramya";
        s2.rollNo=13;
//        public String toString(){
//            return name + " " +rollNo;
//        }

        HashSet <Student>sl = new HashSet();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        sl.add(s4);
        System.out.println(sl);


    }
}
