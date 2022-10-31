package src.intermideat;

import java.util.ArrayList;
import java.util.List;

public class FilterMapSorted {

    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();

        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);


     //   we can use map() to transform an object into another type as well.
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

/*        The sorted() method is an intermediate operation that returns a sorted view of the stream.
                The elements in the stream are sorted in natural order unless we pass a custom Comparator.*/

        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::print);


    }
}
