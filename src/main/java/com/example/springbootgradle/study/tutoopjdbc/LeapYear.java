package com.example.springbootgradle.study.tutoopjdbc;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear();
    }

    private static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년");
        }
        else System.out.println("평년");
    }
}
