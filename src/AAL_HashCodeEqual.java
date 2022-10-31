package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AAL_HashCodeEqual {
    public static void main(String[] args) {


        AL s1 = new AL("Parth", 10);
        AL s2 = new AL("Nalin", 20);
        AL s3 = new AL("Nalin", 20);
        AL s4 = new AL("Jigar", 30);
        AL s5 = new AL("Parth", 10);


        Map<AL, Integer> map1 = new HashMap<>();
        map1.put(s1, 10);
        map1.put(s2, 20);
        map1.put(s3, 20);
        map1.put(s4, 30);
        //map1.put(s5, 10);

       // System.out.println(map1.get(s5));


        Set<Map.Entry<AL, Integer>> mappings = map1.entrySet();
        for (Map.Entry<AL, Integer> mapping : mappings) {
            System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());



	/*
		Student s1 = new Student("Parth");
		Student s2 = new Student("Nalin");
		Student s3 = new Student("Nalin");
		Student s4 = new Student("Jigar");
		Student s5 = new Student("Parth");

		Set<Student> set = new LinkedHashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);


		set.forEach(System.out::println);
	*/
        }
    }
}

