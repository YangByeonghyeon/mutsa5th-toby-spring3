package com.example.springbootgradle.study.tutoopjdbc;

public class is369 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.printf("%02d", cnt);
            int a = cnt / 10;
            int b = cnt % 10;
            if (a % 3 == 0 && a != 0)
                System.out.print("*");
            if (b % 3 == 0 && b != 0)
                System.out.print("*");
            System.out.println();
        }
    }
}
