package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모Car의 move()를 상속받아서 쓸 수 있다.

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
