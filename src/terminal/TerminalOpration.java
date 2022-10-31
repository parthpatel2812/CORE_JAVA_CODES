package src.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOpration {

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


     /*   The forEach() method helps in iterating over all elements of a stream and perform some operation on each of them.
        The operation to be performed is passed as the lambda expression.*/

        memberNames.forEach(System.out::print);

        System.out.println();
        /*  The collect() method is used to receive elements from a steam and store them in a collection.*/
        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);


      /*  Various matching operations can be used to check whether a given predicate matches the stream elements.
        All of these matching operations are terminal and return a boolean result.*/

        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //true

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //false

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //false


        /*        The count() is a terminal operation returning the number of elements in the stream as a long value.*/

        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);     //2



/*        The reduce() method performs a reduction on the elements of the stream with the given function.
        The result is an Optional holding the reduced value
        In the given example, we are reducing all the strings by concatenating them using a separator #.*/

        Optional<String> reduced = memberNames.stream()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);


    }
}
