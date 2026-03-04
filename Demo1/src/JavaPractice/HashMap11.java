import java.util.*;
public class HashMap11 {
    public static void main(String[] args) {

        Map<String , String> st = new HashMap<>();

        Student s1 = getStudent1();
        Student s2 = getStudent2();
        Student s3 = getStudent3();

        st.put(s1.rollNo, s1.name);
        st.put(s2.rollNo, s2.name);
        st.put(s3.rollNo, s3.name);
        st.put(s1.rollNo, s1.name);


        System.out.println(st);
        // iterate using entry set
        Set<Map.Entry<String,String>>entries =st.entrySet();
        for(Map.Entry<String,String>entry : entries){
            entry.getKey();
            String values = entry.getValue();
            System.out.println("Key: "+entry.getKey()+", value: "+entry.getValue().toUpperCase());
        }
        System.out.println("---------------------------------");
        // iterate using iterator
        Iterator<Map.Entry<String, String>> iterator = st.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            next.getValue();
            next.getKey();
            System.out.println("Key: "+next.getKey()+", value: "+next.getValue().toUpperCase());
        }

    }




}

