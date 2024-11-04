package poly.ex3;

public class Dog extends AbstractAnimal { //추상클래스 상속받음

    @Override
    public void sound() {
        System.out.println("멍멍");
    } //오버라이딩
}