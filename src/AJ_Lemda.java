package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AJ_Lemda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AJ_Employee e1 = new AJ_Employee(199, "Parth");
        AJ_Employee e2 = new AJ_Employee(150, "Darth");
        AJ_Employee e3 = new AJ_Employee(100, "Carth");
        AJ_Employee e4 = new AJ_Employee(156, "Aarth");
        AJ_Employee e5 = new AJ_Employee(100, "Zarth");
        AJ_Employee e6 = new AJ_Employee(103, "Zarth");
        AJ_Employee e7 = new AJ_Employee(100, "Yarth");

        List<AJ_Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e6);
        list.add(e5);
        list.add(e7);

        System.out.println("If you Enter '1' list will  compare by empId");
        System.out.println("If you Enter '2' list will  compare by empName");
        System.out.println("If you Enter '2' list will  compare by empName and then ID");

        int input = sc.nextInt();

        switch (input) {
            case 1:
                Collections.sort(list, (o1, o2) -> o1.getEmpId().compareTo(o2.getEmpId()));
                list.forEach(System.out::println);
                break;
            case 2:
                Collections.sort(list, (o1, o2) -> o1.getEmpNmae().compareTo(o2.getEmpNmae()));
                list.forEach(System.out::println);
                break;
            case 3:
                Collections.sort(list, (o1, o2) ->
                        o1.getEmpNmae().compareTo(o2.getEmpNmae()) == 0 ? // if name is same
                                o1.getEmpId().compareTo(o2.getEmpId()) : // compare by ID
                                o1.getEmpNmae().compareTo(o2.getEmpNmae()));
                list.forEach(System.out::println);
                break;
        }
    }
}
