package com.example.springbootgradle.study.tutoopjdbc;

public class CMath {
    public static boolean isPrime(int num) {
        //if (num == 1) return false;

        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) count++;
        }
        return (count == 1);
    }
}
