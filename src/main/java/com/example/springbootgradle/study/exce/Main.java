package com.example.springbootgradle.study.exce;

public class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwException() throws MyException {
        throw new MyException("사용자 정의 예외를 발생시킵니다.");
    }
}
