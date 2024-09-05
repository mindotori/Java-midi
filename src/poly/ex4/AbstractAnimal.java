package poly.ex4;

public abstract class AbstractAnimal { //추상클래스로 생성
    //추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.

    //완전 추상 = 순수추상클래스 (본인이 가지는 기능이 없다)
    public abstract void sound();
    public abstract void move();
}
