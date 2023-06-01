package com.example.springbootgradle.study.gene;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box();
        box.setItem(10);
        int value = box.getItem();
    }
}
/*컬렉션과 배열의 차이점
        컬렉션과 배열은 모두 여러 개의 요소를 저장하는 데 사용되지만, 다음과 같은 차이점이 있습니다.
        - 크기: 배열은 고정된 크기를 가지지만, 컬렉션은 동적으로 크기가 조정될 수 있습니다. 컬렉션은 요소를 추가하거나 제거함으로써 크기를 조절할 수 있습니다.
        - 타입: 배열은 동일한 데이터 타입의 요소만 저장할 수 있지만, 컬렉션은 다양한 데이터 타입의 요소를 저장할 수 있습니다. **제네릭을 사용하여 컬렉션에 저장되는 요소의 타입을 지정할 수도 있습니다.**
        - 유연성: 배열은 요소에 직접 접근할 수 있어 빠른 접근이 가능하지만, 컬렉션은 보다 다양한 조작을 지원하며 편리한 기능을 제공합니다. 예를 들어, 컬렉션은 검색, 정렬, 필터링, 반복 등 다양한 연산을 지원합니다.*/
