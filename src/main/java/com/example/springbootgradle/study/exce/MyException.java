package com.example.springbootgradle.study.exce;

public class MyException extends Exception {
    public MyException() {
        super("사용자 정의 예외가 발생했습니다.");
    }

    public MyException(String message) {
        super(message);
    }
}
