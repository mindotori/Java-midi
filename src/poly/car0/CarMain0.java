package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver(); //운전자 생성
        K3Car k3Car = new K3Car(); // 자동차 생성

        driver.serK3Car(k3Car);
        driver.drive();


        //추가
        Model3Car model3Car = new Model3Car();
        driver.serK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
