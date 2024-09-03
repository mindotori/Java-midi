package extends1.overriding;

public class ElectricCar extends Car {

    @Override //부모의 기능을 새로 재정의
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다."); //부모에서 가져온거 수정
    }

    //상속해서 Car의 move()를 물려받음

    public void charge() {
        System.out.println("충전합니다.");
    }
}
