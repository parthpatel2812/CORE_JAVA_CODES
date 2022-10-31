package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AH_Comparable1 {

    public static void main(String[] args)
    {
        AH_Student1 s1 = new AH_Student1(105, "Parth", "Patel");
        AH_Student1 s2 = new AH_Student1(100, "Jigar", "Pandya");
        AH_Student1 s3 = new AH_Student1(120, "Nalin", "Patel");
        AH_Student1 s4 = new AH_Student1(104, "Parth", "Shah");

        List<AH_Student1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.forEach(System.out::println);

        System.out.println();

        Collections.sort(list);				// we did sorting of objects,,But we need to implement Comparable<> interface and comparTo() method
        list.forEach(System.out::println);

        System.out.println();
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

}
