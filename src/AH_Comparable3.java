package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AH_Comparable3 {
//private static Employee e1;

    public static void main(String[] args) {


	/*
		AAH_Employee e1 = new AAH_Employee("C",new Department("C"));
		AAH_Employee e2 = new AAH_Employee("X",new Department("E"));
		AAH_Employee e3 = new AAH_Employee("Z",new Department("B"));
		AAH_Employee e4 = new AAH_Employee("A",new Department("C"));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Collections.sort(list);

		list.forEach(System.out::println);*/

        AH_Employee e1 = new AH_Employee("Z","A",10,new AH_Department("C",20,34545));
        AH_Employee e2 = new AH_Employee("X","A",10,new AH_Department("C",20,34545));
        AH_Employee e3 = new AH_Employee("Z","A",10,new AH_Department("E",20,34545));
        AH_Employee e4 = new AH_Employee("Z","A",10,new AH_Department("I",20,34545));
        AH_Employee e5 = new AH_Employee("A","A",10,new AH_Department("C",20,34545));

        List<AH_Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list);

        list.forEach(System.out::println);
    }

}

