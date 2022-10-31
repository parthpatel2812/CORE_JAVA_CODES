package src;

import java.util.Scanner;

public class AD_Reverse_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] testArr = new String[4];

        System.out.println("enter " + testArr.length + " name and I will reverse for you");

        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = sc.next();
        }

        for (int i = 0; i < testArr.length / 2; i++) {
            String temp = testArr[i];
            testArr[i] = testArr[testArr.length - (i + 1)];
            testArr[testArr.length - (i + 1)] = temp;
        }

        for (String c : testArr) {
            System.out.print(c + " ");
        }


    }
}
