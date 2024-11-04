package poly.ex3;

public abstract class AbstractAnimal { //추상클래스로 생성
    //추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    public abstract void sound(); //추상메서드는 메서드 바디가 없음 - 호출 되면 안됨

    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}
