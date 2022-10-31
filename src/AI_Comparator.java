package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AI_Comparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AI_Employee e1 = new AI_Employee(199, "Parth");
        AI_Employee e2 = new AI_Employee(150, "Darth");
        AI_Employee e3 = new AI_Employee(100, "Carth");
        AI_Employee e4 = new AI_Employee(156, "Aarth");
        AI_Employee e5 = new AI_Employee(100, "Zarth");
        AI_Employee e6 = new AI_Employee(103, "Xarth");
        AI_Employee e7 = new AI_Employee(100, "Yarth");

        List<AI_Employee> list = new ArrayList<>();
        //	Set<Employee> list = new HashSet<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        System.out.println("If you Enter '1' list will  compare by empId");
        System.out.println("If you Enter '2' list will  compare by empName");
        System.out.println("Press 3 for Exit");

        int input = sc.nextInt();


        switch (input) {
            case 1:
                Collections.sort(list, new AI_ById());
                list.forEach(System.out::println);
                break;
            case 2:
                Collections.sort(list, new AI_ByName());
                list.forEach(System.out::println);
                break;

        }

    }
}
