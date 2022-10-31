package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AH_Comparable2 {
    public static void main(String[] args)
    {
        AH_Student2 s1 = new AH_Student2(117, "Aarth");
        AH_Student2 s2 = new AH_Student2(100, "Xigar");
        AH_Student2 s3 = new AH_Student2(120, "Zalin");
        AH_Student2 s4 = new AH_Student2(104, "Aarth");
        AH_Student2 s5 = new AH_Student2(105, "Parth");
        AH_Student2 s6 = new AH_Student2(102, "Aarth");

        List<AH_Student2> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        Collections.sort(list); // we sorted list by First Name.
        list.forEach(System.out::println);
    }

}
