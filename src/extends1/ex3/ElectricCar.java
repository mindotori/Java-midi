package extends1.ex3;

public class ElectricCar extends Car {
    //상속해서 Car의 move()를 물려받음

    public void charge() {
        System.out.println("충전합니다.");
    }
}
