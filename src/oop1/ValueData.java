package oop1;

public class ValueData {
    int value;

    //메서드 생성 - 여기서 만드는 메서드에는 static키워드를 사용하지 않는다.
    void add() {
        value++;
        System.out.println("숫자 증가 value="+value);
    }
}
