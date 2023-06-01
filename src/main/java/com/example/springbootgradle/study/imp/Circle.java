package com.example.springbootgradle.study.imp;

public class Circle implements Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        System.out.println(circle.calculateArea());
    }
}
/*추상 클래스와 인터페이스의 공통점과 차이점
        공통점:
        - 추상 클래스와 인터페이스 모두 추상 메서드를 포함할 수 있습니다.
        - 둘 다 상속을 통해 기능을 확장하고, 다형성을 지원합니다.
        - 클래스들 간의 관련성을 나타내는 용도로 사용될 수 있습니다.
        차이점:
        - 추상 클래스는 추상 메서드 외에도 일반 메서드와 인스턴스 변수를 포함할 수 있습니다. 반면, 인터페이스는 추상 메서드, 디폴트 메서드, 정적 메서드, 상수만을 가질 수 있습니다.
        - 클래스는 단일 상속만 가능하지만, 인터페이스는 다중 상속을 지원합니다.
        - 추상 클래스는 "extends" 키워드를 사용하여 상속을 선언하고, 인터페이스는 "implements" 키워드를 사용하여 구현을 선언합니다.
        - 클래스가 추상 클래스를 //상속//받을 때는 "is-a" 관계를 갖습니다. 반면, 인터페이스를 //구현//할 때는 "has-a" 관계를 갖습니다.*/

